# TP Archivos

Si separan lo que manipula los archivos de lo que responde la
consigna, es posible armar tests. De otra forma, aunque no
imposible, es un poco mas dificil.

## Consignas
Implementar cada punto como función, creando las adicionales que 
crean convenientes asi como las Excepciones necesarias.

**Observación importante** Los main son los que deben contener el
`java.util.Scanner` para la entrada del usuario, y los 
`System.out.print` para mostrar los resultados. 
**Las funciones a implementar no pueden contenerlos.**

En los programas en los que el usuario debe de indicar un
archivo, si este no de texto, problema del usuario :-D

### Arreglos en disco
El programa trabajará con archivos estructurados, en donde hay 
un número por linea.

#### Archivo a array
Cargar un archivo que contiene números enteros a un array.

#### Array a Archivo
Enviar el contenido de un array a un archivo en el disco.

### Crear archivo aleatorio
Crear un archivo con una cantidad de números indicados por el
usuario, con limites tambien configurables.

#### Ordenar un archivo
Cargar un archivo y escribir uno nuevo pero ordenado.

### Archivos y directorios
Para este programa, vamos a recorrer archivos y directorios.

#### LStado de directorios
Mostrar los nombres de los archivos en un directorio indicado 
y opcionalmente recorrer los subdirectorios.

#### Mostrar archivo
Mostrar el contenido de un archivo indicado.

### Textos
La creación de reportes, es no solo mostrarlos por consola, sino
la creación de archivos conteniendo esa información.

#### Repetidos
A partir de un archivo con números, crear un archivo de reporte
indicando cuantas veces aparece cada caracter alfabetico.

#### Palabras
Crear un reporte que indique cuantas palabras tiene un archivo
de texto. Consideren una palabra como una secuencia de caracteres
alfanuméricos separados por caracter invisible como los espacios o
tabuladores.

#### Parrafos
Crear un reporte en el que se indique cuantos parrafos contiene un
texto, consideren a un parrafo como dos saltos de linea consecutivos 
luego de un "`.`"

