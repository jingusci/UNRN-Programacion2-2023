package programacion.practica.arboles;

public interface ArbolOrdenado extends Arbol<T extends Comparable<T>>{
    public void insercionOrdenada(T valor);
}
