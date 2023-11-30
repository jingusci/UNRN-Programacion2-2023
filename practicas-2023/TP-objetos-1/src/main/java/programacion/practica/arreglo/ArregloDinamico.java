package programacion.practica.arreglo;

/**
 * Este arreglo esta pensado para poder alojar mas valores a lo largo del
 * tiempo, creciendo cuando sea necesario.
 */
public class ArregloDinamico {
    /**
     * Lo que almacena los valores, tengan en cuenta que el `.length`
     * No es el largo, sinó la capacidad de almacenamiento del arreglo.
     */
    private int[] arreglo;
    /**
     * El tamaño 'virtual' del arreglo, que es el que será reportado
     * cuando pregunten.
     */
    private int largo;

    /**
     * Constructor del ArregloDinamico
     *
     * @param largoInicial indica el tamaño con el que comenzara.
     */
    public ArregloDinamico(int largoInicial) {
        throw new RuntimeException("Implementar");
    }

    /**
     * Indica el largo del ArregloDinamico.
     *
     * @return la cantidad de elementos del ArregloDinamico
     */
    public int largo() {
        throw new RuntimeException("Implementar");
    }

    /**
     * Inserta el valor en la posición indicada.
     * PRE: la posición debe ser un valor entre 0 y largo de ArregloDinamico + 1
     * POST: El ArregloDinamico quedará con un elemento más luego de la operación
     *
     * @param posicion en donde será insertado valor
     * @param valor    lo que será insertado
     * @throws IndexOutOfBoundsException cuando la posición sea negativa o
     *                                   fuera de los limites del ArregloDinamico.
     */
    public void insertar(int posicion, int valor) {
        throw new RuntimeException("Implementar");
    }

    /**
     * Inserta al final del ArregloDinamico el valor indicado.
     * POST: El ArregloDinamico quedará con un elemento más luego de la operación
     *
     * @param valor el valor del elemento a insertar
     */
    public void insertarAlFinal(int valor) {
        throw new RuntimeException("Implementar");
    }

    /**
     * Inserta al comienzo del ArregloDinamico el valor indicado
     * POST: El ArregloDinamico quedará con un elemento más luego de la operación
     *
     * @param valor el valor del elemento a insertar
     */
    public void insertarAlComienzo(int valor) {
        throw new RuntimeException("Implementar");
    }

    /**
     * Inserta el valor de forma que el ArregloDinamico se mantiene en orden.
     * Si el arreglo no estaba en orden, el elemento se ubicará en la primera
     * posicion que cumpla con la condición.
     * POST: El ArregloDinamico quedará con un elemento más luego de la operación.
     * POST: El ArregloDinamico se mantendrá el orden luego de esta operación.
     *
     * @param valor el valor del elemento a insertar
     */
    public void insertarEnOrdenAscendente(int valor) {
        throw new RuntimeException("Implementar");
    }

    /**
     * Remueve y retorna el elemento de la posición indicada.
     * PRE: la posición debe ser un valore entre 0 y largo de ArregloDinamico
     * POST: El ArregloDinamico quedará con un elemento menos luego de la operación
     *
     * @param posicion que elemento será extraido
     * @return el valor del elemento extraido
     * @throws IndexOutOfBoundsException cuando la posición sea negativa o
     *                                   fuera de los limites del ArregloDinamico.
     */
    public int extraer(int posicion) {
        throw new RuntimeException("Implementar");
    }

    /**
     * Elimina el elemento de la posición indicada.
     * PRE: la posición debe ser un valore entre 0 y largo de ArregloDinamico
     * POST: El ArregloDinamico quedará con un elemento menos luego de la operación
     *
     * @param posicion que elemento será extraido
     * @return el valor del elemento extraido
     * @throws IndexOutOfBoundsException cuando la posición sea negativa o
     *                                   fuera de los limites del ArregloDinamico.
     */
    public void borrar(int posicion) {
        throw new RuntimeException("Implementar");
    }

    /**
     * Retorna el elemento de la posición indicada.
     * PRE: la posición debe ser un valore entre 0 y largo de ArregloDinamico
     * POST: El ArregloDinamico no cambiará la cantidad de elementos.
     *
     * @param posicion que elemento será extraido
     * @return el valor del elemento extraido
     * @throws IndexOutOfBoundsException cuando la posición sea negativa o
     *                                   fuera de los limites del ArregloDinamico.
     */
    public int obtener(int posicion) {
        throw new RuntimeException("Implementar");
    }

    /**
     * Este metodo hace coincidir el largo del arreglo interno con el largo
     * del ArregloDinamico
     * POST: El largo del ArregloDinamico no cambia
     */
    public void compactar() {
        throw new RuntimeException("Implementar");
    }

    /**
     * Permite cambiar la capacidad disponible del arregloDinamico
     * POST: el largo del ArregloDinamico no cambia
     *
     * @param capacidad
     */
    public void ampliar(int capacidad) {
        throw new RuntimeException("Implementar");
    }

    /**
     * Devuelve el contenido del ArregloDinamico como un arreglo tradicional
     *
     * @return un arreglo con el contenido del ArregloDinamico
     */
    public int[] comoArreglo() {
        throw new RuntimeException("Implementar");
    }

    public void ordenarMayorMenor() {
        throw new RuntimeException("Implementar");
    }

    public void ordenarMenorMayor() {
        throw new RuntimeException("Implementar");
    }
}

