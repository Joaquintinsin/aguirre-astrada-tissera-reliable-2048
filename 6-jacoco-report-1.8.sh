#!/bin/bash

echo 'Testear los tests comunes'
mvn -f pom-evosuite.xml clean test jacoco:report -Dtest='BoardTest,CellTest,DeterministicBoardTest,RegressionTest,RegressionTest0'
