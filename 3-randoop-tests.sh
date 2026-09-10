#!/bin/bash

java -cp "lib/randoop-all-4.3.4.jar:target/classes" \
  randoop.main.Main gentests \
  --testclass=ar.edu.unrc.game2048.Cell \
  --testclass=ar.edu.unrc.game2048.Board \
  --testclass=ar.edu.unrc.game2048.DeterministicPlacement \
  --testclass=ar.edu.unrc.game2048.NonDeterministicPlacement \
  --testclass=ar.edu.unrc.game2048.Position \
  --time-limit=10 \
  --junit-output-dir=src/test/java \
  --junit-package-name=randoopTests
