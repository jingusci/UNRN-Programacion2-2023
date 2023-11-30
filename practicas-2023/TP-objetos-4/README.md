# TP-objetos-4

## Arreglos III

Este TP requiere de tener el TP que refiere al `ArregloDinamico` completo y sin observaciones.

Vamos a trabajar con Polimorfismo Parametrico.

### ArregloGenerico

Esta clase es 99% a la del TP de `ArregloDinamico`, por lo que la base ya esta en su lugar.

El objetivo de este TP es implementar un arreglo que reciba cualquier tipo de valor `Comparable`,
esto ya esta en el esqueleto contenido en el repositorio.

Los tests son compatibles con esta nueva clase, hay que hacer algunos ajustes y que si hay alguna duda.
La vemos en Discord. 

### Persona

Creen una clase `Persona`, la cual implemente `Comparable<Persona>` para hacer que el `ArregloGenerico`
ordene un conjunto de manera alfabetica por el `apellido`.

### Investigación

Agreguen un archivo markdown que contenga una lista de las interfaces presentes en la plataforma de Java.
Junto a una pequeña descripcion de su proposito o uso. (son MUCHAS, por lo que concentren la investigación
en las contenidas dentro de los paquetes `java.lang` y `java.util` y subpaquetes.


# Referencias
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Comparable.html
