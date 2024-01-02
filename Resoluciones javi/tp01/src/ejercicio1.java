
/**
 * Javier Ingusci
 * javieringusci
 * UNRN Andina - Programación 2
 */

import java.util.Scanner;

class ejercicio1 {
    public static void main(String[] args) {

        // Declaración de variables
        float tempCentigrados = 0;
        float tempFahrenheit = 0;

        // Creación de un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitud de números (flotantes)
        System.out.print("Ingrese los grados centígrados que desea convertir a Fahrenheit: ");
        tempCentigrados = scanner.nextFloat();

        System.out.print("Ingrese los grados Fahrenheit que desea convertir a centígrados: ");
        tempFahrenheit = scanner.nextFloat();

        // Funciones que convierten
        float resultadoFahrenheit = centigrados_a_fahrenheit(tempCentigrados);
        float resultadoCentigrados = fahrenheit_a_centigrados(tempFahrenheit);

        // Muestra de resultados
        System.out.printf("%.2f grados centígrados son %.2f grados Fahrenheit\n", tempCentigrados, resultadoFahrenheit);
        System.out.printf("%.2f grados Fahrenheit son %.2f grados centígrados\n", tempFahrenheit, resultadoCentigrados);

        // Cierre del Scanner
        scanner.close();
    }

    /**
     * Esta función convierte una temperatura de grados Centigrados a grados
     * Fahrenheit.
     *
     * @param centigrados Temperatura en grados Centigrados.
     *
     * @return La temperatura convertida a grados Fahrenheit.
     *
     */
    public static float centigrados_a_fahrenheit(float centigrados) {
        return (centigrados * 9 / 5) + 32;
    }

    /**
     * Esta función convierte una temperatura de grados Fahrenheit a grados
     * Centigrados.
     *
     * @param fahrenheit Temperatura en grados Fahrenheit.
     *
     * @return La temperatura convertida a grados Centigrados.
     *
     */
    public static float fahrenheit_a_centigrados(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}