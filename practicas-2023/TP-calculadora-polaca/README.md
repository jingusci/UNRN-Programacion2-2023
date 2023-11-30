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
`ArrayList` que está en el paquete `java.util.ArrayList`
Es una forma más fácil (que los arreglo) de guardar conjuntos
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

Pero para más detalles sobre lo que pueden hacer, consulten
con su manual: [ArrayList](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/ArrayList.html) 


Siempre pueden usar un `array` comun:
```java
Operacion[] valore = new Operacion[10];
```
Pero estarían limitados a una cantidad fija de `Operacion`.
Mientras que con el `ArrayList`, cuantos hay, no importa.

## Estructura de paquetes

Creen un paquete para la calculadora, en la cual estarán las clases Operación, Numero y la excepción raíz.

Asimismo, creen un paquete para agrupar los tipos de operaciones, uno para las unarias, otro para binarias
y uno para las multiples.

# Notación prefija (polaca)
Normalmente, empleamos la notación "infija", en la cual el operador va en el medio de los operandos. En esta notación, 
es necesario definir la precedencia de los operandos para saber que par de operaciones resolver primero.

La notación polaca es una forma de construir operaciones binarias sin la utilización de paréntesis, solo es necesario
separar los operandos entre sí con un espacio. Esta solo funciona con operaciones binarias como está definida.

Un ejemplo simple de esta notación para una suma: `+ 2 3` es `2 + 3`.
El resultado esperado con la calculadora sería algo como
```java
Numero operandoUno = new Numero(2);
Numero operandoDos = new Numero(3);
Operacion resultado = new Suma(operandoUno, operandoDos);
```
Y un ejemplo un poco menos simple, `* + 2 6 5` es `(2+6)*5`.
```java
Numero dos = new Numero(2);
Numero seis = new Numero(6);
Numero operandoIntermedio = new Suma(dos, seis);
Numero cinco = new Numero(5);
Operacion resultado = new Multiplicacion(operandoIntermedio, cinco)
```
Finalmente, otro ejemplo sin procesar con las expresiones que pueden encontrarse.

### Calculando desde String 
Su misión, si desea aceptarla, es construir un programa que utilizando un `Stack`, procese un `String` con una expresión
matemática y pueda obtener su resultado.

Primero que procese `String`s que contengan expresiones binarias, y después encaren el resto. Como siempre, observen
la separación de la entrada y salida.

El método a implementar sería algo como:
```java
public Operacion desdeCadena(String expresiones) throws CalculadoraExcepcion;
```
Este método puede estar en `Operación` y probablemente sea un método estático.

Pueden modificar todas las clases y métodos de la consigna original para este ejercicio extra. Algo para agregar, es
un método en `Operacion` que sea `aCadenaPolaca()` para verificar que el método implementado funcione correctamente.
(Si la estructura resultante es la misma, entonces la implementación es correcta.)

Siguiendo el primer ejemplo
```java
Numero operandoUno = new Numero(2);
Numero operandoDos = new Numero(3);
Operacion resultado = new Suma(operandoUno, operandoDos);
Operacion interpretada = Calculadora.desdeCadena(resultado.aCadenaPolaca());
```
En donde `resultado` e `interpretada` deben ser la misma estructura y dar el mismo resultado.
(Es una oportunidad interesante para implementar `equals`)

### Operaciones Multiples (Plus Ultra #1)
A pesar de que la notación no está pensada para operandos multiples o unarios, es posible introducir paréntesis para
saber cuáles son los operandos que pertenecen a una OperaciónMultiple.
Por ejemplo:
`SUMA(3 5 6 7 + 3 3)` es `SUMA(3, 5, 6, 7, (3 + 3))`.

### Más Ejemplos
