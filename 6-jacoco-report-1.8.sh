#!/bin/bash

echo 'Crear reporte JaCoCo con los tests comunes y randoop'

REPORT_DIR="reports/jacoco/tests-comunes"
mvn -f pom-evosuite.xml clean test jacoco:report \
  -Dtest='BoardTest,CellTest,DeterministicBoardTest,RegressionTest,RegressionTest0'
mkdir -p "$(dirname "$REPORT_DIR")"
rm -rf "$REPORT_DIR"
mv target/site/jacoco "$REPORT_DIR"


echo 'Crear reporte JaCoCo con los tests de EvoSuite'

REPORT_DIR="reports/jacoco/tests-evosuite"
mvn -f pom-evosuite.xml clean test jacoco:report -Dtest='*_ESTest'
mkdir -p "$(dirname "$REPORT_DIR")"
rm -rf "$REPORT_DIR"
mv target/site/jacoco "$REPORT_DIR"
