#!/bin/bash

mvn -f pom.xml clean compile
mvn -f pom.xml test jacoco:report
