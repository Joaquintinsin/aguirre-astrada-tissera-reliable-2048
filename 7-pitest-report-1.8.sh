#!/bin/bash

mvn -f pom-evosuite.xml test pitest:mutationCoverage \
  -DtimeoutConstant=10000 \
  -Dverbose=true \
  -DtimeoutFactor=1.25
