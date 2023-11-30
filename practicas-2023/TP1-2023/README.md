# TP-Java desde C

Aprovechando que la sintaxis base de Java es practicamente la misma que la de C, reciclaremos
algunos ejercicios de Programación 1, como para tener el primer contacto con el lenguaje.

## Forma de entrega

- Cada punto debe ser entregado en un archivo separado, el mismo debe contener el 
método `main` y las funciones que sean necesarias para completar el ejercicio.

- El nombre del archivo debe coincidir con el nombre de la clase dentro, vean el 
ejemplo/plantilla dentro del repositorio.

- Para este TP, no es necesario utilizar un entorno de programación, los programas
no requieren de archivos adicionales por lo que puede funcionar con `java HolaMundo.java` 
directamente. (El proximo TP requerirá del entorno y los programas seran mas complejos)

- No olviden completar la plantilla con sus datos y agregar la descripción de cada funcion.
(`main` puede no tener este comentario)

- Siempre que sea posible, los mensajes de commit deben ser descriptivos, nada de "cambios"

- Implementen un main que haga un uso de las funciones implementadas, pueden utilizar
- un `Scanner` para usar `STDIN`, o tambien usar los argumentos 

## Ejercicios

### [1] Conversión de temperaturas

Se quiere transformar temperaturas en grados fahrenheit, kelvin y centígrados. Implementar funciones que completen todas las conversiones entre estas tres medidas.

### [2] Suma lenta

Escribir una función que haga la suma entre dos números enteros sin hacer la operación de
manera directa. La funcion debe ser capaz de sumar cualquier numero entero positivo y negativo.

### [3] División lenta

Escribir una función que mediante restas sucesivas, obtenga el valor del cociente y el resto 
de dos números enteros.

### [4] Potencia lenta

Escribir una funcion que mediante sumas sucesivas, obtenga el valor de potenciación entre dos 
números enteros.

### [5] Factorial

Escribir una funcion que calcule el factorial de un número entero.

### [6] Es Primo

Escribir una funcion que indique si un número es primo o no.

### [7] Es Palindromo?

Escribir una funcion que indique si una cadena es palindromo o no.

### [8] Fibonacci

Escribir una función que devuelva el n-esimo termino de la sucesión de Fibonacci.

Recuerden que la sucesión se compone de la suma de los ultimos dos terminos. De esta manera, 
el primer termino vale cero y el segundo uno.


# Plantilla y ejemplo

```Java
/**
 * Alumno
 * usuariogithub
 * UNRN Andina - Programación 2
 */
class HolaApp {
    public static void main(String[] args) {
        hola();
    }
    /**
     * Esta funcion no recibe nada y no devuelve nada
     */
    public static void hola() {
        System.out.println("Hola mundo!");
    }
}
```
