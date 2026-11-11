package ar.edu.unrc.game2048.fuzzing;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import ar.edu.unrc.game2048.Board;
import ar.edu.unrc.game2048.DeterministicPlacement;

/**
 * Harness for mutated (mostly invalid) board strings (Assignment 5, Ej. 1.b).
 *
 * An independent validator (isValid) decides whether each input SHOULD be
 * accepted. Board.fromString is then compared against it.
 *
 *   REJECTED         - invalid input, IllegalArgumentException (expected)
 *   ACCEPTED         - valid input, accepted, and all FuzzHarness oracles hold
 *   WRONGLY_ACCEPTED - invalid input but fromString built a board      (BUG)
 *   WRONGLY_REJECTED - valid input but fromString threw IAE            (BUG)
 *   FAIL             - accepted, but an oracle failed / too slow       (BUG)
 *   CRASH            - any other Throwable (NPE, SOE, OOM, ...)        (BUG)
 *
 * Usage:
 *   java -ea -cp target/classes ar.edu.unrc.game2048.fuzzing.MutationHarness \
 *        mutated.txt [movesPerBoard] [seed] [report.tsv]
 */
public class MutationHarness {

    // ---- Decisiones de especificacion: acordarlas con el equipo ----
    /** fromString hace trim() del string y de cada token: se permiten espacios/tabs. */
    static final boolean ALLOW_WHITESPACE = true;
    /** "02" es valido? */
    static final boolean ALLOW_LEADING_ZEROS = false;
    static final long SLOW_MS = 2000;

    enum Outcome { REJECTED, ACCEPTED, WRONGLY_ACCEPTED, WRONGLY_REJECTED, FAIL, CRASH }

    static final class Result {
        final Outcome outcome;
        final String signature;
        final String detail;

        Result(Outcome outcome, String signature, String detail) {
            this.outcome = outcome;
            this.signature = signature;
            this.detail = detail;
        }

        boolean isBug() {
            return outcome != Outcome.REJECTED && outcome != Outcome.ACCEPTED;
        }
    }

    private final FuzzHarness inner;

    MutationHarness(int movesPerBoard, long seed) {
        this.inner = new FuzzHarness(movesPerBoard, seed);
    }

    Result check(String input, int index) {
        boolean expectedValid = isValid(input);
        Board board;
        long start = System.nanoTime();
        try {
            board = Board.fromString(input, new DeterministicPlacement());
        } catch (IllegalArgumentException e) {
            String msg = String.valueOf(e.getMessage());
            if (msg.startsWith("Board string too long to parse")) {
                return new Result(Outcome.REJECTED, "", "");   // limitación documentada
            }
            return expectedValid
                    ? new Result(Outcome.WRONGLY_REJECTED, "rejected a valid string", msg)
                    : new Result(Outcome.REJECTED, "", "");
        } catch (Throwable t) {
            StackTraceElement[] st = t.getStackTrace();
            String where = st.length > 0 ? st[0].toString() : "?";
            return new Result(Outcome.CRASH, t.getClass().getSimpleName() + " at " + where, String.valueOf(t));
        }
        long ms = (System.nanoTime() - start) / 1_000_000;
        if (ms > SLOW_MS) {
            return new Result(Outcome.FAIL, "fromString too slow", ms + " ms");
        }
        if (!expectedValid) {
            return new Result(Outcome.WRONGLY_ACCEPTED, "accepted an invalid string",
                    "parsed as " + board.toArrayString());
        }
        // Valid and accepted: reuse Cami's oracles on the canonical form.
        FuzzHarness.Result r = inner.check(board.toArrayString(), index);
        if (r.outcome == FuzzHarness.Outcome.PASS) {
            return new Result(Outcome.ACCEPTED, "", "");
        }
        Outcome o = r.outcome == FuzzHarness.Outcome.CRASH ? Outcome.CRASH : Outcome.FAIL;
        return new Result(o, "after accept: " + r.signature, r.detail);
    }

    // ===================== Independent validator =====================

    /** [v1,...,vn] with n a perfect square and each vi = 0 or a power of two <= 2^30. */
    static boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        String t = ALLOW_WHITESPACE ? strip(s) : s;
        if (t.length() < 2 || t.charAt(0) != '[' || t.charAt(t.length() - 1) != ']') {
            return false;
        }
        String[] parts = t.substring(1, t.length() - 1).split(",", -1); // -1 keeps trailing empties
        int n = parts.length;
        int size = (int) Math.round(Math.sqrt(n));
        if (size * size != n) {
            return false;
        }
        for (String p : parts) {
            if (!isValidCell(ALLOW_WHITESPACE ? strip(p) : p)) {
                return false;
            }
        }
        return true;
    }

    static boolean isValidCell(String tok) {
        if (tok.isEmpty()) {
            return false;
        }
        for (int i = 0; i < tok.length(); i++) {
            char c = tok.charAt(i);
            if (c < '0' || c > '9') {   // ASCII only, on purpose
                return false;
            }
        }
        if (!ALLOW_LEADING_ZEROS && tok.length() > 1 && tok.charAt(0) == '0') {
            return false;
        }
        int k = 0;
        while (k < tok.length() - 1 && tok.charAt(k) == '0') {
            k++;
        }
        String digits = tok.substring(k);
        if (digits.length() > 10) {
            return false;
        }
        long v = Long.parseLong(digits);
        return v == 0 || (v <= (1L << 30) && (v & (v - 1)) == 0);
    }

    /** Strips only ' ' (tabs are NOT accepted by Board.fromString). */
    static String strip(String s) {
        int a = 0, b = s.length();
        while (a < b && s.charAt(a) == ' ') {
            a++;
        }
        while (b > a && s.charAt(b - 1) == ' ') {
            b--;
        }
        return s.substring(a, b);
    }
    // ===================== Hand-written edge cases =====================

    static String bigBoard(int size, String cell) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size * size; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(cell);
        }
        return sb.append(']').toString();
    }

    static List<String> handCases() {
        List<String> c = new ArrayList<>();
        for (String s : new String[] {
                null, "", " ", "[", "]", "[]", "[,]", "[0", "0]", "[[0]]", "[0]]", "[[0]", "[0],[0]",
                "[0,0,0]", "[0,0,0,0,]", "[,0,0,0,0]", "[0,,0,0]", "[0,0,0,0,,]",
                "[-2]", "[-0]", "[3]", "[6,0,0,0]", "[1]", "[2147483648]", "[1073741825]",
                "[99999999999999999999]", "[02]", "[0000000002]", "[00000000002]", "[+2]",
                "[2.0]", "[0x2]", "[2e1]", "[\u0662]", "[\uff12]", "[2\u00a0]", "[\u00a02]",
                "[2 ,0,0,0]", " [0] ", "\t[0]\t", "[0]\n", "\n[0]", "[0]\r\n", "[0]\u0000", "\u0000[0]",
                "[2 2,0,0,0]", "[null]", "[NaN]", "{0}", "(0)", "[0;0;0;0]",
                "[1073741824]", "[2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]", "[0,0,0,0,4,2,0,0,0,0,0,0,2,2,2,2]"
        }) {
            c.add(s);
        }
        // Inputs grandes: pueden dar StackOverflowError en regex con grupos repetidos.
        c.add(bigBoard(300, "0"));
        c.add(bigBoard(1000, "0"));
        c.add(bigBoard(300, "0").replaceFirst("0", "x"));
        return c;
    }

    // ============================ DRIVER ============================

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Usage: MutationHarness <mutated.txt> [movesPerBoard] [seed] [report.tsv]");
            System.exit(2);
        }
        int moves = args.length > 1 ? Integer.parseInt(args[1]) : 20;
        long seed = args.length > 2 ? Long.parseLong(args[2]) : 0L;
        String reportFile = args.length > 3 ? args[3] : null;

        MutationHarness harness = new MutationHarness(moves, seed);
        List<String> inputs = new ArrayList<>(handCases());
        int handCount = inputs.size();
        inputs.addAll(Files.readAllLines(Paths.get(args[0]), StandardCharsets.UTF_8)); // empty lines ARE cases

        int[] counts = new int[Outcome.values().length];
        Map<String, Object[]> bySignature = new LinkedHashMap<>();
        List<String> report = new ArrayList<>();
        report.add("source\toutcome\tsignature\tinput\tdetail");

        for (int i = 0; i < inputs.size(); i++) {
            String input = inputs.get(i);
            boolean hand = i < handCount;
            Result r = harness.check(input, i);
            counts[r.outcome.ordinal()]++;
            if (r.isBug()) {
                String shown = input == null ? "null"
                        : input.length() > 120 ? input.substring(0, 120) + "...(" + input.length() + " chars)" : input;
                shown = shown.replace("\n", "\\n").replace("\r", "\\r").replace("\u0000", "\\0");
                String key = r.outcome + ": " + r.signature;
                Object[] e = bySignature.get(key);
                String where = hand ? "hand case" : "line " + (i - handCount + 1);
                if (e == null) {
                    bySignature.put(key, new Object[] { 1, where + ": " + shown + "\n      " + r.detail });
                } else {
                    e[0] = (Integer) e[0] + 1;
                }
                report.add(where + "\t" + r.outcome + "\t" + r.signature + "\t" + shown + "\t" + r.detail);
            }
        }

        System.out.println("=== MutationHarness: " + args[0] + " (+" + handCount + " hand cases) ===");
        int bugs = 0;
        for (Outcome o : Outcome.values()) {
            System.out.println(o + ": " + counts[o.ordinal()]);
            if (o != Outcome.REJECTED && o != Outcome.ACCEPTED) {
                bugs += counts[o.ordinal()];
            }
        }
        if (!bySignature.isEmpty()) {
            System.out.println("\nDistinct failure signatures (count, first example):");
            for (Map.Entry<String, Object[]> e : bySignature.entrySet()) {
                System.out.println("[" + e.getValue()[0] + "] " + e.getKey());
                System.out.println("      " + e.getValue()[1]);
            }
        }
        if (reportFile != null) {
            try (PrintWriter pw = new PrintWriter(reportFile, "UTF-8")) {
                report.forEach(pw::println);
            }
            System.out.println("\nFull report: " + reportFile);
        }
        System.exit(bugs == 0 ? 0 : 1);
    }
}