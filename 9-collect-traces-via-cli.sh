#!/bin/bash
set -e

export JDK8=/usr/lib/jvm/java-8-openjdk-amd64
export JDK11=/usr/lib/jvm/java-11-openjdk-amd64


export PATH="$JDK11/bin:$PATH"

GAMES=${GAMES:-20}
MIN_MOVES=${MIN_MOVES:-50}
MAX_MOVES=${MAX_MOVES:-150}

mkdir -p daikon-traces

for ((g = 1; g <= GAMES; g++)); do
    echo "Partida $g/$GAMES..."
    python3 fuzzer_stdout.py "$MIN_MOVES" "$MAX_MOVES" | "$JDK11/bin/java" \
         -Dtools_jar_location="$JDK8/lib/tools.jar" \
         -cp "lib/daikon.jar:target/classes" \
         daikon.Chicory \
         --ppt-select-pattern='ar\.edu\.unrc\.game2048\.(Board|Cell).*' \
         --output-dir=daikon-traces \
         --dtrace-file="cli-game-$g.dtrace" \
         ar.edu.unrc.game2048.MainCLI > /dev/null
done

echo "Listo: $GAMES partidas instrumentadas en daikon-traces/cli-game-*.dtrace*"
