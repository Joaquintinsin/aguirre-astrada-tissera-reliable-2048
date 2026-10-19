"""
Fuzzer for piping moves directly into an instrumented CLI process.

fuzzer.py (Assignment 3) can't be used for this: its CLIRunner spawns its
own subprocess per trial and never prints the raw move sequence to stdout.
This script reuses the same RandomFuzzer from fuzzer.py, but just writes
one fuzzed sequence to stdout so it can be piped straight into Chicory:

    python3 fuzzer_stdout.py [min_length] [max_length] | \
        java -cp "lib/daikon.jar:target/classes" daikon.Chicory \
             --output-dir=daikon-traces ar.edu.unrc.game2048.MainCLI
"""

import sys

from fuzzer import RandomFuzzer


def main():
    min_length = int(sys.argv[1]) if len(sys.argv) > 1 else 50
    max_length = int(sys.argv[2]) if len(sys.argv) > 2 else 150

    fuzzer = RandomFuzzer(min_length=min_length, max_length=max_length)
    sys.stdout.write(fuzzer.fuzz())


if __name__ == "__main__":
    main()
