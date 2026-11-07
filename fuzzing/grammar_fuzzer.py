"""
Grammar-based fuzzer for 2048 boards (Assignment 5, Ejercicio 1.a.1).

Follows the "Fuzzing with Grammars" chapter of the Fuzzing Book:
  https://www.fuzzingbook.org/html/Grammars.html

A grammar is a dict  nonterminal -> list of alternative expansions.
Each expansion is a string that may contain other nonterminals (<...>).
simple_grammar_fuzzer() starts from <start> and keeps replacing a random
nonterminal by one of its expansions until only terminals remain.

Usage:
    python3 fuzzing/grammar_fuzzer.py [count] [seed] > boards-valid.txt

Each output line is one board, e.g. [0,2,0,4].
"""

import random
import re
import sys

START_SYMBOL = "<start>"
RE_NONTERMINAL = re.compile(r"(<[^<> ]*>)")

# Board sizes generated (n x n).  4 is the real game; the others exercise
# the size-generic code paths of Board.
SIZES = [1, 2, 3, 4, 4, 4, 5, 6, 8]   # 4 repeated -> more likely

# Powers of two that fit in a Java int: 2^1 .. 2^30.
SMALL_POWERS = [str(2 ** k) for k in range(1, 12)]    # 2 .. 2048
BIG_POWERS = [str(2 ** k) for k in range(12, 31)]     # 4096 .. 2^30


def cells_rule(n):
    """Expansion with n*n <cell> nonterminals separated by commas."""
    return ",".join(["<cell>"] * (n * n))


BOARD_GRAMMAR = {
    "<start>": ["<board>"],
    # one alternative per size; duplicates in SIZES act as weights
    "<board>": ["[<cells%d>]" % n for n in SIZES],
    **{"<cells%d>" % n: [cells_rule(n)] for n in set(SIZES)},
    # 1/3 empty, 1/3 "normal" tile, 1/3 huge tile (to stress overflow)
    "<cell>": ["0", "<small>", "<big>"],
    "<small>": SMALL_POWERS,
    "<big>": BIG_POWERS,
}


class ExpansionError(Exception):
    pass


def nonterminals(expansion):
    return RE_NONTERMINAL.findall(expansion)


def is_valid_grammar(grammar, start_symbol=START_SYMBOL):
    """Every used nonterminal is defined, and every defined one is reachable."""
    used = {start_symbol}
    for expansions in grammar.values():
        for e in expansions:
            used.update(nonterminals(e))
    defined = set(grammar.keys())
    return used == defined


def simple_grammar_fuzzer(grammar, start_symbol=START_SYMBOL,
                          max_nonterminals=100, max_expansion_trials=100):
    """
    Fuzzing Book's simple_grammar_fuzzer: expand random nonterminals until
    none remain.  max_nonterminals bounds the size of the intermediate term
    (our grammar is not recursive, so it only needs to fit an 8x8 board).
    """
    term = start_symbol
    expansion_trials = 0

    while len(nonterminals(term)) > 0:
        symbol_to_expand = random.choice(nonterminals(term))
        expansion = random.choice(grammar[symbol_to_expand])
        new_term = term.replace(symbol_to_expand, expansion, 1)

        if len(nonterminals(new_term)) < max_nonterminals:
            term = new_term
            expansion_trials = 0
        else:
            expansion_trials += 1
            if expansion_trials >= max_expansion_trials:
                raise ExpansionError("Cannot expand " + repr(term))

    return term


class GrammarFuzzer:
    """Fuzzer object with the same fuzz() interface as fuzzer.py."""

    def __init__(self, grammar=BOARD_GRAMMAR, start_symbol=START_SYMBOL):
        assert is_valid_grammar(grammar, start_symbol)
        self.grammar = grammar
        self.start_symbol = start_symbol

    def fuzz(self):
        return simple_grammar_fuzzer(self.grammar, self.start_symbol)


def main():
    count = int(sys.argv[1]) if len(sys.argv) > 1 else 10000
    seed = int(sys.argv[2]) if len(sys.argv) > 2 else 2048
    random.seed(seed)

    fuzzer = GrammarFuzzer()
    for _ in range(count):
        print(fuzzer.fuzz())


if __name__ == "__main__":
    main()
