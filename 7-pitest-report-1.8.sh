#!/bin/bash

mvn -f pom-evosuite.xml test pitest:mutationCoverage \
  -DtimeoutConstant=10000 \
  -Dverbose=true \
  -DtimeoutFactor=1.25

mkdir -p reports
rm -rf reports/pitest
mv target/pit-reports reports/pitest
