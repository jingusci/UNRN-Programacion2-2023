 Letrado

## Forma de entrega

- Documenten cada atributo, clase y método.
- Desarrollen casos de prueba que 'ejerciten' la mayor cantidad de casos posible.
- Crear las clases de Excepciones necesarias para los casos que crean convenientes

## ¡Letrado!
- Una libreria en el centro de Bariloche recibe niños todos los dias a la salida del 
colegio. Resulta que en estos ratos que la libreria esta repleta, los niños desordenan
todos los libros, por lo tanto se busca una forma de entretenerlos con unas computadoras
que estan disponibles. Por eso, se los busca a ustedes _futur@s tecnic@s e ingenier@s_ para
que creen un juego que pueda divertirlos!

- El juego consiste en ir adivinando una palabra que el programa elige aleatoriamente, para
luego ir adivinandola letra por letra, para esto tendremos un limite de intentos. Son libres
de agregar las funciones o caracteristicas que gusten al juego para hacerlo mas completo.

- Mantengan separado lo que es la entrada y salida del juego en sí.

### Seleccionar palabra
Implementar un método que seleccione una palabra aleatoria dentro de un fichero.

### Cargar palabras
Implementar un método que cargue las palabras de un fichero y luego las retorne en
un arreglo de Strings.

### Adivinar letra
Implementar un método que verifique si la letra introducida esta presente en la
palabra seleccionada aleatoriamente.

### Adivinar palabra
Implementar un método que verifique si la palabra introducida es igual a la palabra
seleccionada aleatoriamente.

### Selector de categoria
Implementar un método que permita al usuario seleccionar entre varios ficheros de
distintas categorias de palabras.

### Pistas
Implementar un método que permita al usuario pedir una pista si asi lo desea
(puede ser una letra en cualquier posicion de la palabra).

## Ayuda con las clases

Si estan muy trabados con la separación de las clases, pueden consultar una ayudita acá.

<details>
  <summary>Spoiler warning</summary>
  
Una ayuda con la separacion en clases, el PoolPalabras esta pensado para ser usado por el juego.
Pero de esta manera, es mas facil hacer categorias de palabras, por dificultad y por tema.

Tambien, pueden usar la clase `PoolPalabras` directamente con un conjunto de palabras fijo
para armar tests del juego de forma mucho mas facil. Incluyendo pasarle una sola palabra
para que siempre de la misma.

```java
public class PoolPalabras{
    protected String nombre;
	protected ArrayList<String> palabras;
	protected Random dado;

	public PoolPalabras(String nombre){
		this.palabras = new ArrayList<String>(palabras);
		this.nombre = nombre;
		this.dado = new Random();
	}

	public PoolPalabras(ArrayList<String> palabras, String nombre){
		this(nombre);
		this.palabras.addAll(palabras);
	}

	public String aleatoria() throws SinPalabrasException{
		int cantidad = this.palabras.size();
		if (cantidad == 0){
		    throw new SinPalabrasException("No hay palabras en el Pool " + nombre);
		}
		return this.palabras.get(random.nextInt(cantidad));
	}

}
```
Y una variacion de lo anterior, para tomar las palabras de un archivo
```java
public class PoolPalabrasArchivo extends PoolPalabras{
	protected String nombreArchivo;

	public PoolPalabrasArchivo(String nombreArchivo){
		super(nombreArchivo); //menos .txt o algo similar
		this.nombreArchivo = nombreArchivo;
	}
	public void cargar() throws IOException{
	    // cargamo el archivo
    }
}

```

</details>
