package programacion.practica.estructuras;

/**
 * Esta interfaz aplica para cualquier implementación de un conjunto de
 * elementos con orden.
 *
 * @param <T> del tipo que aceptará la Secuencia.
 */
public interface Secuenciable<T> {

    /**
     * Indica el largo de la Secuenciable.
     *
     * @return la cantidad de elementos del Secuenciable
     */
    public int largo();

    /**
     * Modifica el valor en la posición indicada.
     *
     * @param posicion cuyo valor será reemplazado.
     * @param valor    que reemplazara el existente en la posicion.
     */
    public void modificar(int posicion, T valor);

    /**
     * Inserta el valor en la posición indicada.
     * PRE: la posición debe ser un valor entre 0 y largo de Secuenciable + 1
     * POST: El Secuenciable quedará con un elemento más luego de la operación
     *
     * @param posicion en donde será insertado valor
     * @param valor    lo que será insertado
     * @throws IndexOutOfBoundsException cuando la posición sea negativa o
     *                                   fuera de los límites del Secuenciable.
     */
    public void insertar(int posicion, T valor);

    /**
     * Inserta al final del Secuenciable el valor indicado.
     * POST: El Secuenciable quedará con un elemento más luego de la operación
     *
     * @param valor el valor del elemento a insertar
     */
    public void insertarAlFinal(T valor);

    /**
     * Inserta al comienzo del Secuenciable el valor indicado
     * POST: El Secuenciable quedará con un elemento más luego de la operación
     *
     * @param valor el valor del elemento a insertar
     */
    public void insertarAlComienzo(T valor);

    /**
     * Remueve y retorna el elemento de la posición indicada.
     * PRE: la posición debe ser un valore entre 0 y largo de Secuenciable
     * POST: El Secuenciable quedará con un elemento menos luego de la operación
     *
     * @param posicion que elemento será extraído
     * @return el valor del elemento extraído
     * @throws IndexOutOfBoundsException cuando la posición sea negativa o
     *                                   fuera de los límites del Secuenciable.
     */
    public T extraer(int posicion);

    /**
     * Elimina el elemento de la posición indicada.
     * PRE: la posición debe ser un valore entre 0 y largo de Secuenciable
     * POST: El Secuenciable quedará con un elemento menos luego de la operación
     *
     * @param posicion que elemento será borrado
     * @return el valor del elemento borrado
     * @throws IndexOutOfBoundsException cuando la posición sea negativa o
     *                                   fuera de los límites del Secuenciable.
     */
    public void borrar(int posicion);

    /**
     * Retorna el elemento de la posición indicada.
     * PRE: la posición debe ser un valore entre 0 y largo de Secuenciable
     * POST: El Secuenciable no cambiará la cantidad de elementos.
     *
     * @param posicion que elemento será obtenido
     * @return el valor del elemento obtenido
     * @throws IndexOutOfBoundsException cuando la posición sea negativa o
     *                                   fuera de los límites del Secuenciable.
     */
    public T obtener(int posicion);
}


