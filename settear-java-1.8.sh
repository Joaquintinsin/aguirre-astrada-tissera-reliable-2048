#!/bin/bash

# Se debe usar: source ./settear-java-1.8.sh

# Settear Java 1.8
# Pone temporalmente en la terminal java 1.8

export JAVA_HOME=/usr/lib/jvm/jdk1.8.0_501
export PATH="$JAVA_HOME/bin:$PATH"

java -version
javac -version

echo "============================"
echo "Java deberia ser 1.8"
echo "============================"
