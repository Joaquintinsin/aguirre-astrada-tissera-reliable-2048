# Assignment 4

## Phase 1: Instrumentation and Trace Collection

### 1.1 Compile the Project

```bash
mvn -f pom-daikon.xml clean test-compile
```

### 1.2 Run Chicory on Your Existing Tests

El proyecto tiene tests de JUnit 5 (`CellTest` y `BoardTest`) y tests de JUnit 4 generados por Randoop/EvoSuite.

El jar 5.9.0 de Daikon requiere Java 11 o mayor, mientras que Chicory necesita el jar `tools.jar` de JDK 8.

Modificar rutas de JDK en el script [8-run-daikon.sh](./8-run-daikon.sh) si fuese necesario.

Finalmente, correr Daikon/Chicory usando el script:

```bash
./8-run-daikon.sh
```

### 1.3 Collect Additional Traces via the CLI (optional)

Usando el script 9:

```bash
./9-collect-traces-via-cli.sh
```

Vamos a ejecutar el CLI del juego y Daikon va a generar las trazas de los invariantes observados.
