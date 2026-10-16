#!/bin/bash

java -cp "lib/daikon.jar:target/classes" \
     daikon.Chicory \
     --output-dir=daikon-traces \
     ar.edu.unrc.game2048.MainCLI
