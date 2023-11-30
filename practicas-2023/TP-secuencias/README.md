# TP-secuencias

## Implementaciones

Implementar las interfaces en el paquete `programacion.practica.estructuras`
utilizando nodos enlazados. 

Puesto que ambas son muy parecidas, pueden hacer que la implementación sea una
sola clase:
```java
public class ListaEnlazada implements Stack<T>, Secuenciable<T>{
    
}
```
Siendo que son tan similares, es posible implementar `Stack` con arreglos, y que este 
sea eficiente. Solo es necesario agregar un método más.

```java

/**
 * Nos indica si no hay más espacio disponible en el Stack.
 * 
 * @return True cuando no se puede insertar más elementos.
 */
public boolean estaLleno();
```
Para saber cuando hemos agotado el arreglo interno.

La principal diferencia radica en que cada elemento insertado, va al final para evitar
tener que mover todo el contenido del arreglo en cada `push`.

Implementar el Stack como arreglo no es parte de la consigna, pero es un buen
ejercicio.

Implementen el método `toString` para obtener una representación del contenido 
de la secuencia.

## Palindromo
Creen una clase y `main` que permita saber si una cadena es palindromo utilizando
el `Stack` creado en el punto anterior.
### Salida esperada
```
neuquen es Palindromo
```

No olviden crear tests para verificar automáticamente el programa.

## Balanceado
Creen una clase y `main` que permita saber si uno de los siguientes pares de 
caracteres `()`, `[]` y `{}` se encuentran balanceados. Esto es, para cada símbolo
de apertura, hay uno de cierre.

```
[]][][[[]]] no esta balanceado
[][[][[]]] esta balanceado
```

## Balanceado y estructurado [OPCIONAL]
Tener en cuenta que los caracteres diferentes no pueden 'salir' de otro, por ejemplo
`([)]` esta balanceado, pero no es correcto.

No olviden crear tests para verificar automáticamente el programa.

