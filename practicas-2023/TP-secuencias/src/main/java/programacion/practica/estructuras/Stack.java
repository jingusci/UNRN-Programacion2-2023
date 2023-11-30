package programacion.practica.estructuras;

/**
 * Esta interfaz indica el comportamiento mínimo de una estructura
 * Pila (Stack, en Inglés).
 * <p>
 * Uno de los usos de esta estructura, es facilitar la creación de
 * algoritmos que verifican si algo está balanceado.
 *
 * @param <T> el tipo que será almacenado en la estructura.
 */
public interface Stack<T> {
    /**
     * Agrega un valor en la pila.
     * #POST: la pila contiene un elemento más.
     * El nuevo elemento 'empujará' en anterior elemento insertado a la
     * segunda posición.
     *
     * @param valor que será 'empujado' en la pila.
     */
    public void push(T valor);

    /**
     * Obtiene y remueve el primer elemento de la estructura.
     * #POST: la pila contiene un elemento menos.
     *
     * @return el elemento que está más arriba.
     */
    public T pop();

    /**
     * Obtiene el primer elemento de la estructura.
     * #POST: la pila no cambia la cantidad de elementos.
     *
     * @return el elemento que está más arriba.
     */
    public T peek();

    /**
     * Indica si la estructura contiene elementos.
     *
     * @return True si hay elementos.
     */
    public boolean estaVacia();

}

