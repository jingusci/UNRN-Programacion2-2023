/**
 * Javier Ingusci
 * javieringusci
 * UNRN Andina - Programación 2
 */
class Ejercicio1 
{
    public static void main(String[] args) {

        // Convertir 25 grados centigrados a fahrenheit
        // -> Deberia dar 77
        System.out.println("25°C -> °F : " + centigrados_a_fahrenheit(25));

        // Convertir 77 grados fahrenheit a centigrtados
        // -> Deberia dar 25
        System.out.println("77°F -> °C : " + fahrenheit_a_centigrados(77));
    }

    /*
     * Esta funcion convierte valores de grados centigrados a fahrenheit.
     * 
     * @param centigrados es el valor que recibe (float)
     * 
     * @return fahrenheit valor convertido (float)
     */
    public static float centigrados_a_fahrenheit(float centigrados) {
        return (centigrados * 9 / 5) + 32;
    }

    /*
     * Esta funcion convierte valores de grados fahrenheit a centigrados.
     * 
     * @param fahrenheit es el valor que recibe (float)
     * 
     * @return centigrados valor convertido (float)
     */
    public static float fahrenheit_a_centigrados(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}