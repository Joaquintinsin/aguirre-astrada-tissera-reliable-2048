#!/bin/bash

# Se debe usar: source ./settear-java-21.sh

# Settear Java 21
# Pone temporalmente en la terminal java 21

export JAVA_HOME=/usr/lib/jvm/jdk-21.0.3+9
export PATH="$JAVA_HOME/bin:$PATH"

java -version
javac -version

echo "============================"
echo "Java deberia ser 21.0.3"
echo "============================"
