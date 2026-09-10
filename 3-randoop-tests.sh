#!/bin/bash

echo "Testeando antes de hacer Randoop..."
LOG_FILE=tests_antes_de_randoop.log
echo "Resultados guardados en $LOG_FILE"
mvn test > $LOG_FILE

echo "Haciendo Randoop..."
java -cp "lib/randoop-all-4.3.4.jar:target/classes" \
  randoop.main.Main gentests \
  --testclass=ar.edu.unrc.game2048.Cell \
  --testclass=ar.edu.unrc.game2048.Board \
  --testclass=ar.edu.unrc.game2048.DeterministicPlacement \
  --testclass=ar.edu.unrc.game2048.Position \
  --omit-methods="\
    ar.edu.unrc.game2048.Board\(\)|\
    ar.edu.unrc.game2048.Board\(\s*int\s*\)$|\
    ar.edu.unrc.game2048.Board\(\s*ar.edu.unrc.game2048.Board\s*\)$" \
  --time-limit=10 \
  --junit-output-dir=src/test/java \
  --junit-package-name=randoopTests

echo "Testeando despues de hacer Randoop..."
LOG_FILE=tests_despues_de_randoop.log
echo "Resultados guardados en $LOG_FILE"
mvn test > $LOG_FILE
