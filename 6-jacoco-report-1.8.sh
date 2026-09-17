#!/bin/bash

mvn -f pom-evosuite.xml clean compile
mvn -f pom-evosuite.xml test jacoco:report
