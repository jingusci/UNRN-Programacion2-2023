package programacion.practica.arboles;

/**
 * La estructura de datos Árbol es también el nodo individual, esto permite
 * aprovechar su naturaleza recursiva y simplificar su implementación.
 *
 * @param <T> el tipo de clase que contendrá este ArbolBinario
 */
public interface NodoBinario<T> {
    /**
     * Nos da acceso a lo que está a la izquierda
     *
     * @return el nodo ubicado a la izquierda de este.
     */
    public NodoBinario<T> izquierda();

    /**
     * Nos da acceso a lo que está a la derecha
     *
     * @return el nodo ubicado a la derecha de este.
     */
    public NodoBinario<T> derecha();

    /**
     * Esta Operación solo reemplaza la rama completa por el nuevo nodo.
     * No hace más manipulaciones en los nodos.
     *
     * @param ramaIzquierda es la nueva rama de este lado.
     */
    public void setIzquierda(NodoBinario<T> ramaIzquierda);

    /**
     * Esta Operación solo reemplaza la rama completa por el nuevo nodo.
     * No hace más manipulaciones en los nodos.
     *
     * @param ramaDerecha es la nueva rama de este lado.
     */
    public void setDerecha(NodoBinario<T> ramaDerecha);

    /**
     * Nos permite acceder al contenido del Nodo.
     *
     * @return el valor contenido en el Nodo
     */
    public T obtenerContenido();

    /**
     * Substituye el valor interno por el pasado por argumento.
     *
     * @param valor a reemplazar
     */
    public void reemplazarContenido(T valor);

    /**
     * Indica si este Nodo es una hoja
     *
     * @return True cuando no hay subarboles
     */
    public boolean esHoja();
}
