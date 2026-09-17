# Division del proyecto

Existe un problema de dependencias entre las herramientas usadas para el proyecto.

De tal manera, podemos dividir el proyecto en dos etapas: antes de evosuite y despues de evosuite.

# Antes de evosuite

Los scripts enumerados del 1 al 3 son los iniciales, anteriores a evosuite.

Estos scripts utilizan la version de Java 21 y el [pom.xml](./pom.xml) con la version actualizada.

Para esto, estos comandos preferentemente se utilizan utilizando esa version.

Para comodidad, tenemos el script [`settear-java-21.sh`](./settear-java-21.sh)

Este script debe correrse haciendo:

```bash
source ./settear-java-21.sh
```

De manera de que impacte la actualizacion de la version de java en la terminal actual.

# Despues de evosuite

Los scripts enumerados del 4 en adelante, asumen que se utiliza la herramienta de evosuite.

Estos scripts utilizan la version de Java 1.8 y el [pom-evosuite.xml](./pom-evosuite.xml) con la version que evosuite necesita.

Para esta etapa, se utilizara la version de Java 1.8.

Para comodidad, tenemos el script [`settear-java-1.8.sh`](./settear-java-1.8.sh)

Este script debe correrse haciendo:

```bash
source ./settear-java-1.8.sh
```

De manera de que impacte la actualizacion de la version de java en la terminal actual.
