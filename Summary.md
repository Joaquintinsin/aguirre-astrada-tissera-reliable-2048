A lo largo de este proyecto, con nuestro equipo fuimos encontrando desafios siguiendo las cuatro fases pedidas como tarea.

Antes de comenzar, leimos las clases principales `Board`, `MainCLI` y `Cell`.
Luego, iniciamos la fase 1 escribiendo tests para la clase `Board` y `Cell`, ya que son las dos mas importantes para testear.

Asumamos que la primer fase 1 comienza con el [commit inicial](https://github.com/Seminario-en-Ciencias-de-la-Computacion/basic-design-implementation-and-testing-assignment-aguirre-astrada-tissera/commit/26cfe3f33aea0c7311e1e46d7393c5b3474ca691)

La fase 1 termina y a su vez comienzan las fases 2 y 3 en [este commit](https://github.com/Seminario-en-Ciencias-de-la-Computacion/basic-design-implementation-and-testing-assignment-aguirre-astrada-tissera/commit/18ea6e80a74c7bb8481ebfac11a2e2d3c162fdc0).

Inmediatamente corrimos los tests y comenzamos la fase 2, la etapa de descubrimiento de bugs.
Al encontrar bugs luego de correr los tests, documentamos en issues de github los tests que fallan y el log dado como salida.

Principalmente, los tests que fallaban eran los de movimiento.

La fase 3 trata sobre arreglar tales bugs, que con la ayuda del log podemos detectar cuales fallan, por que fallan y mas detalles sobre la deteccion de los bugs.

El principal bug encontrado en los movimientos es que al mover hacia abajo, no llegaba a tocar la fila 0 porque le faltaba el `<=` a la condicion del loop.

Todos los movimientos en general contenian codigo repetido, que no lo calificamos como bug sino como mejora de diseño, por lo tanto lo consideramos como una menor prioridad ante el bug del recorrido.

Al corregir este error, damos inicio a la fase 4 que trata sobre mejoras de diseño. El commit que da cierre a las fases 2 y 3 y le da inicio a la fase 4 es [este](https://github.com/Seminario-en-Ciencias-de-la-Computacion/basic-design-implementation-and-testing-assignment-aguirre-astrada-tissera/commit/342e5c859b4fda30757b43dd5e02b92c4f6ecf8c).

En este commit podemos ver que agregamos la dependencia JaCoCo a nuestro proyecto para seguir mas de cerca la cobertura de nuestros tests y tener un [reporte luego de testear](https://github.com/Seminario-en-Ciencias-de-la-Computacion/basic-design-implementation-and-testing-assignment-aguirre-astrada-tissera/blob/main/target/site/jacoco/index.html).

Mejoramos el diseño haciendo lo siguiente:
- Eliminamos la duplicacion de codigo en los movimientos, refactorizando en metodos con visibilidad protected.
- Eliminamos las clases internas innecesarias sobre `Board`, que son `Direction` y `Position`, dandoles su lugar adecuado por fuera de la clase para una posible reutilizacion y mejorando la escalabildad.
- Prevenimos movimientos si el tablero se encuentra en un estado terminado (un tablero ganador o un tablero perdedor).
- Implementamos y testeamos el patron de diseño Strategy para que el juego ahora pueda ser deterministico o no-deterministico.
  - Esto brinda una ventaja sobre testing principalmente porque podemos eliminar el factor aleatorio y tener mejores hardcodings sobre cualquier tablero

Para dar cierre al resumen, agregamos que como estamos frente a una metodogia agil incremental, que es lo usado hoy en dia en el desarrollo de aplicaciones, se agregaron nuevos tests incluso estando en la fase 4, que resultan en una mejor test-suite, y este se refleja con los ultimos commits en el repositorio.
