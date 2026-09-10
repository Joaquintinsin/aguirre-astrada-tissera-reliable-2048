#!/bin/bash
# Settear Java 8

# Hacer el README de jdk 8 primero
# Para que este .sh se quede en la terminal actual, hacer `source ./0-settear-java.sh`
# Pone temporalmente en la terminal java 8 para correr el proyecto

type -a java
type -a javac
readlink -f "$(which java)"
readlink -f "$(which javac)"
echo "$JAVA_HOME"
echo "$PATH"
sudo update-alternatives --display java
sudo update-alternatives --display javac

export JAVA_HOME=/usr/lib/jvm/jdk1.8.0_501
export PATH="$JAVA_HOME/bin:$PATH"
hash -r

java -version
javac -version

echo "============================"
echo "Java deberia ser 1.8"
echo "============================"

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

# Run tests
mvn -f pom-evosuite.xml test
