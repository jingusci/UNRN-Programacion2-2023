# Calculadora Orientada a Objetos
No olviden completar todos los comentarios de documentación faltantes.
Y si ven alguna pre/poscondición que falte, agreguenla.

## Importante
Asegurensé de que el proyecto funcione correctamente con el proyecto Gradle
presente en el repositorio mismo.

## Detalles sobre los diagramas de clase 

En el siguiente diagrama hay un par de cuestiones de notación para
tener en cuenta:
 * \+ es publico (`public`)
 * \# es protegido (`protected`)
 * \- es privado (`private`)

Las letras en la fila del nombre de la clase tambien 
tienen su significado.
 * (A) Abstracto (`abstract class`)
 * (C) Clase (`class`)

Finalmente, los métodos abstractos, se ven en '_italica_'
en el diagrama.

## Calculadora
Siguiendo lo que estuvimos viendo en clases como ejemplo.
Su trabajo ahora es completar todo lo que falta y algunas
operaciones adicionales.

Implementen las clases siguiendo el siguiente diagrama:

![](https://www.plantuml.com/plantuml/svg/hP9FJnin4CNl_XIkk81Gf9uHgaYX1wJ-gHhH--pkA8ngpsp7uuYIyjthnc5B5oo4n37pUtxlPMRFae5QZi6ziMkCwCS0n2xz81v18Ve-G4fBCwKk6rxsmYkwHV_MEUYIAVHM9VxBYEKN2M-TtzwpEt_iYOi4Gfy3wE7H3AvCYTSUpc50XeBlsiPN34fGx1U9OYT1Jkfhvm_aNdCogVyFUbZW-2MXxwcTIhS_Cw4EyZ3rO435_bfUlScd78p6W4zMMQh2hu-Kx7JIl_CR2AAOIiv6QF2mLboNu4dXPJnwORdQwNEEgBBrfGcnrPpoO7xfOXSx0lt-bnzEofRtlrwdlnUBVSXy_EWoRZweibMEBVGDaxNOVidKxr13T44RIctyuMOKHkvfXzf_uAg-SRD1LLto1jL8dwQxZIwx926Rj0nwnOZSuXSuyLR3wPDpZoRxRH5Jb2Q5coQj1th6lrxgET5NbOW3DOFEXGtKkJFa8SVWt1y0)

Si se les ocurren más operaciones, ¡bienvenidas sean!

## `ArrayList` en `OperacionMultiple`
Un detalle sobre el tipo de `valores`, esto es un 
`ArrayList` que esta en el paquete `java.util.ArrayList`
Es una forma mas facil (que los arreglo) de guardar conjuntos
de cosas, en este caso, de `Operacion`. 

Contiene un poco de sintaxis extra que no vimos puntualmente hoy
La sintaxis general agrega entre `<` y `>` el tipo de lo
que será almacenado.
```java
ArrayList<tipo> variable = new ArrayList<tipo>();
```
Y un ejemplo concreto para guardar números enteros 
(solo es posible guardar Objetos, por lo que es necesario usar
los "wrappers" en lugar de `int` directamente)

```java
ArrayList<Integer> conjuntoNumeros = new ArrayList<Integer>();
```
Y otro, para guardar instancias de `Operacion`
```java
ArrayList<Operacion> valores = new ArrayList<Operacion>();
```
Un detalle importante, el `ArrayList valores` no contiene
nada aún, para eso, tiene que hacer algo como `valores.add(op1)`

Pero para mas detalles sobre lo que pueden hacer, consulten
con su manual: [ArrayList](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/ArrayList.html) 


Siempre pueden usar un `array` comun:
```java
Operacion[] valore = new Operacion[10];
```
Pero estarian limitados a una cantidad fija de `Operacion`.
Mientras que con el `ArrayList`, cuantos hay, no importa.

## Estructura de paquetes

Creen un paquete para la calculadora, en la cual estaran las clase Operación, Numero y la excepción raíz.

Asimismo, creen un paquete para agrupar los tipos de operaciones, uno para las unarias, otro para binarias
y uno para las multiples.

