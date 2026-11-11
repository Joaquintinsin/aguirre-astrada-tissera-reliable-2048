#!/bin/bash
# Assignment 5 - Ejercicio 1.b: mutation-based fuzzing of board strings.
#
# Uso:  source ./settear-java-21.sh && ./12-fuzz-mutated-boards.sh [cantidad] [movimientos] [seed]
#
#   1. compila el proyecto
#   2. genera tableros validos con la gramatica -> fuzzing-out/boards-valid.txt
#   3. los muta (agregar/borrar/modificar chars) -> fuzzing-out/boards-mutated.txt
#   4. corre el arnes (+ casos escritos a mano)  -> fuzzing-out/report-mutated.tsv

set -u
COUNT=${1:-10000}
MOVES=${2:-20}
SEED=${3:-0}
OUT=fuzzing-out
mkdir -p "$OUT"

mvn -q compile || exit 1

# Misma gramatica que 1.a, con la semilla indicada
python3 fuzzing/grammar_fuzzer.py "$COUNT" 2048 > "$OUT/boards-valid.txt"

python3 fuzzing/mutator.py \
    --in "$OUT/boards-valid.txt" \
    --out "$OUT/boards-mutated.txt" \
    --seed "$SEED" \
    --max-mutations 5

echo
java -ea -cp target/classes ar.edu.unrc.game2048.fuzzing.MutationHarness \
    "$OUT/boards-mutated.txt" "$MOVES" "$SEED" "$OUT/report-mutated.tsv"