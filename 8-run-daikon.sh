#!/bin/bash

export JDK8=/usr/lib/jvm/jdk1.8.0_501
export JDK11=/usr/lib/jvm/java-11-openjdk-amd64

rm -rf daikon-traces
mkdir -p daikon-traces
mvn -f pom-daikon.xml dependency:build-classpath \
    -Dmdep.outputFile=target/daikon-classpath.txt

CP="lib/daikon.jar:target/classes:target/test-classes:$(cat target/daikon-classpath.txt)"

"$JDK11/bin/java" \
     -Dtools_jar_location="$JDK8/lib/tools.jar" \
     -Xmx2g -cp "$CP" \
     daikon.Chicory \
     --ppt-select-pattern='ar\.edu\.unrc\.game2048\.(Board|Cell).*' \
     --output-dir=daikon-traces \
     org.junit.runner.JUnitCore \
     randoopTests.RegressionTest
