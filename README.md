# Kata 2 - Ingeniería del Software 2

## Proyecto

Continuación de la Kata 1, reutilizando la clase de dominio `Person` y su método `age()`.

El proyecto permite leer datos de personas desde un fichero TSV mediante `InputStream`, transformar cada fila en un objeto `Person` y generar un resumen con el número de personas mayores y menores de edad.

El resultado se escribe mediante `OutputStream`, tanto en consola como en un fichero local.

- Java / JDK: 27
- IntelliJ IDEA
- Maven

Para ejecutar el proyecto, abrirlo en IntelliJ IDEA y ejecutar la clase `Main`. El programa utiliza un TSV público de GitHub y una copia local (`people.tsv`).

## Vídeo

Puedes ver el vídeo explicativo de la Kata 2 aquí:

[Ver vídeo de la Kata 2 en YouTube](https://youtu.be/Oy8uWkEd0mQ)

## Práctica y verificación

La kata se realizó varias veces para adquirir soltura con IntelliJ IDEA y el manejo de entrada y salida de datos.

Durante la realización se practicaron shortcuts de generación de código, gestión de excepciones y refactorización mediante `Extract Method`.

Finalmente, se comprobó la lectura de datos desde Internet y desde un fichero local, la generación del resumen y su escritura en consola y en `summary.txt`, así como el tratamiento de errores.

## Git

Se realizaron varias repeticiones de la kata, conservadas en las ramas `intento-1`, `intento-2`, `intento-3`, `intento-4` e `intento-5`.

La versión final se integró en la rama principal `main`.

`intento-5 → merge en main → push`
