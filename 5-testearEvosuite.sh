#!/bin/bash

# Para correr este script se necesita que java sea 1.8


# Run tests
mvn -f pom-evosuite.xml clean compile
mvn -f pom-evosuite.xml test
