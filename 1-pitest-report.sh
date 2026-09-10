#!/bin/bash

mvn -f pom.xml test pitest:mutationCoverage
