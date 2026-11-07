#!/bin/bash
# Assignment 5 - Ejercicio 1.a: grammar-based fuzzing of boards.
#
# Uso:  source ./settear-java-21.sh && ./11-fuzz-boards.sh [cantidad] [movimientos]
#
#   1. compila el proyecto
#   2. genera tableros con la gramatica      -> fuzzing-out/boards-valid.txt
#   3. corre el arnes sobre esos tableros    -> fuzzing-out/report-valid.tsv

set -u
COUNT=${1:-10000}
MOVES=${2:-20}
OUT=fuzzing-out
mkdir -p "$OUT"

mvn -q compile || exit 1

python3 fuzzing/grammar_fuzzer.py "$COUNT" 2048 > "$OUT/boards-valid.txt"

echo
java -ea -cp target/classes ar.edu.unrc.game2048.fuzzing.FuzzHarness \
    "$OUT/boards-valid.txt" "$MOVES" 0 "$OUT/report-valid.tsv"
