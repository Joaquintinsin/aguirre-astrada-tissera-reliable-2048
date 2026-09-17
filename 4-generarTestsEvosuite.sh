#!/bin/bash

# Para correr este script se necesita que java sea 1.8

# generate_evosuite_tests.sh

EVOSUITE_JAR="evosuite-1.0.6.jar"
EVOSUITE_URL="https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar"
SEARCH_BUDGET=60

# Download EvoSuite if not exists
if [ ! -f "$EVOSUITE_JAR" ]; then
    echo "Downloading EvoSuite..."
    wget "$EVOSUITE_URL" || curl -L -o "$EVOSUITE_JAR" "$EVOSUITE_URL"
fi

# Build project first
mvn -f pom-evosuite.xml clean compile

CLASS_PATH=$(pwd)/target/classes

# Generate tests
TARGET_CLASS="ar.edu.unrc.game2048.Cell"
echo "Generating EvoSuite tests for $TARGET_CLASS class..."
java -jar "$EVOSUITE_JAR" -projectCP "$CLASS_PATH" -class $TARGET_CLASS \
    -Dsearch_budget=$SEARCH_BUDGET -Dtest_dir=src/test/java


TARGET_CLASS="ar.edu.unrc.game2048.Board"
echo "Generating EvoSuite tests for $TARGET_CLASS class..."
java -jar "$EVOSUITE_JAR" -projectCP "$CLASS_PATH" -class $TARGET_CLASS \
    -Dsearch_budget=$SEARCH_BUDGET -Dtest_dir=src/test/java

TARGET_CLASS="ar.edu.unrc.game2048.DeterministicPlacement"
echo "Generating EvoSuite tests for $TARGET_CLASS class..."
java -jar "$EVOSUITE_JAR" -projectCP "$CLASS_PATH" -class $TARGET_CLASS \
    -Dsearch_budget=$SEARCH_BUDGET -Dtest_dir=src/test/java

TARGET_CLASS="ar.edu.unrc.game2048.NonDeterministicPlacement"
echo "Generating EvoSuite tests for $TARGET_CLASS class..."
java -jar "$EVOSUITE_JAR" -projectCP "$CLASS_PATH" -class $TARGET_CLASS \
    -Dsearch_budget=$SEARCH_BUDGET -Dtest_dir=src/test/java

TARGET_CLASS="ar.edu.unrc.game2048.Position"
echo "Generating EvoSuite tests for $TARGET_CLASS class..."
java -jar "$EVOSUITE_JAR" -projectCP "$CLASS_PATH" -class $TARGET_CLASS \
    -Dsearch_budget=$SEARCH_BUDGET -Dtest_dir=src/test/java
