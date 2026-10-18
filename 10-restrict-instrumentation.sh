#!/bin/bash

set -euo pipefail

mvn -f pom-daikon.xml test-compile dependency:build-classpath \
    -Dmdep.outputFile=target/daikon-classpath.txt

CP="lib/daikon.jar:target/classes:target/test-classes:$(cat target/daikon-classpath.txt)"

rm -rf daikon-traces
mkdir -p daikon-traces

java -cp "$CP" \
     daikon.Chicory \
     --ppt-select-pattern='ar\.edu\.unrc\.game2048\.(Board|Cell).*' \
     --output-dir=daikon-traces \
     org.junit.runner.JUnitCore \
     randoopTests.RegressionTest
