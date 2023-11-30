# TP-arreglos y excepciones

## Forma de entrega

- Cada punto debe ser entregado en un archivo separado, el mismo debe contener
el método `main` y las funciones que sean necesarias para completar el ejercicio.
- Para este TP, no es necesario utilizar un entorno de programación, los 
programas no requieren de archivos adicionales por lo que puede funcionar 
con `java HolaMundo.java` directamente.
- No olviden completar la plantilla con sus datos y agregar la descripción de 
cada funcion. (`main` puede no tener este comentario)
- Siempre que sea posible, los mensajes de commit deben ser descriptivos, 
nada de "cambios"
- Implementen un main que haga un uso de las funciones implementadas, pueden 
utilizar un `Scanner` para usar `STDIN`, o tambien usar los argumentos
- La documentacion de cada función a implementar debe seguir la plantilla que
se encuentra al final de la consigna.
- Implementar una funcion de pruebas por cada funcion a implementar en la que se
'ejercite' la mayor cantidad de casos de lo que esta siendo probado.
- Crear las clases de Excepciones necesarias para los casos que crean convenientes

## Ejercicios

### [1] Arreglos de números enteros
En una unica clase, se pide implementar un conjunto de funciones para trabajar
con arreglos. Pueden comparar contra la funcionalidad presente en java.util.Arrays
pero no utilizarla. Si pueden usar sus propias funciones, incluyendo las de las
consignas.

El main de este ejercicio debe ejercitar todas las funciones y casos de prueba
implementados.

En todos los casos, los arreglos deben poder ser ajustados al principio del programa.


#### [1.1] Mostrar arreglos
Implementar una funcion que pueda mostrar un arreglo de cualquier tamaño

#### [1.2] Cargar arreglos
Implementar una funcion que permita cargar via System.in un arreglo

#### [1.3] Ordenar arreglos
Implementar una funcion que cree una copia del arreglo pero ordenado. Implementar
una funcion para cada direccion de ordenamiento

#### [1.4] Sumar arreglos
Implementar una funcion que sume todos los valores del arreglo

#### [1.5] Promediar arreglos
Implementar una funcion que promedie los valores del arreglo, dando el resultado
como un valor decimal.

#### [1.6] Maximo, minimo y medio
Implementar funciones que obtengan el valor maximo, el minino y el mas cercano
al valor medio entre los dos primeros.

#### [1.7] Carga aleatoria
Implementar una funcion que cargue un arreglo con numeros aleatorios.
Utilizando java.util.Random

```java
    Random generator = new Random();
    int aleatorio = rand.nextInt(max) + min;
```

#### [1.8] Redimension
Implementar una funcion que dado un arreglo y una nueva dimension, devuelva uno
nuevo con la nueva capacidad.

#### [1.9] Remover
Implementar una funcion que remueva un elemento del arreglo, indicado por su 
posicion y haciendo del arreglo una posicion mas chico.

### Plantilla función

```java
/**
  * Descripción de la función 
  * @param nombre descripción
  * @returns descripción del retorno
  * @throws si lanzara alguna excepcion
  * #PRE:
  * #POST:
  */
```

