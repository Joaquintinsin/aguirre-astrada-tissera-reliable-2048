#!/bin/bash

# Para correr este script se necesita que java sea 1.8
# Corre solo los tests generados por EvoSuite (*_ESTest) y genera el reporte de JaCoCo
# Requiere separateClassLoader = false en los *_ESTest.java
# Reporte: target/site/jacoco/index.html

echo 'Testear lo que genero Evosuite'
mvn -f pom-evosuite.xml clean test jacoco:report -Dtest='*_ESTest'
