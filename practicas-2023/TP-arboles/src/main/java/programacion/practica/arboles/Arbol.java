package programacion.practica.arboles;

import programacion.practica.listas.ListaEnlazada;

/**
 * Esta clase es lo que se ve y usa como Arbol de números enteros
 */
public interface Arbol<T> {

    /**
     * Nos devuelve la raíz del Árbol en cuestión
     *
     * @return el NodoBinario raíz
     */
    public NodoBinario<T> laRaiz();

    public int cantidadHojas();

    public int cantidadNodos();

    public int altura();

    public boolean existe(T valor);

    public void borrar(T valor) throws ValorNotFoundException;

    public void insertarIzquierdaDe(T valor, T nuevoValor) throws ValorNotFoundException;

    public void insertarDerechaDe(T valor, T nuevoValor) throws ValorNotFoundException;

    public void espejo();

    public void esVacio();

    public ListaEnlazada<Integer> recorridoPreOrden();

    public ListaEnlazada<Integer> recorridoInOrden();

    public ListaEnlazada<Integer> recorridoPostOrden();
}
