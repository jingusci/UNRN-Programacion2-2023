
/**
 * Javier Ingusci
 * javieringusci
 * UNRN Andina - Programación 2
 */

import java.util.Scanner;

class ejercicio2 {
    public static void main(String[] args) {

        // Declaración de variables
        int numero1 = 0;
        int numero2 = 0;
        int total = 0;

        // Creación de un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitud de números
        System.out.print("Ingrese el primer numero: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numero2 = scanner.nextInt();

        // Suma
        total = suma_lenta(numero1, numero2);

        // Muestra de resultados
        System.out.printf("Suma lenta de %d + %d = %d\n", numero1, numero2, total);

        // Cierre del Scanner
        scanner.close();
    }

    /**
     * Esta función realiza la suma de dos números de manera lenta, mediante un
     * bucle.
     *
     * @param numero      El primer número a sumar.
     * @param otro_numero El segundo número a sumar.
     *
     * @return La suma de los dos números.
     *
     */
    public static int suma_lenta(int numero, int otro_numero) {
        int resultado = numero;
        if (otro_numero >= 0) {
            for (int i = 1; i <= otro_numero; i++) {
                System.out.printf("Sumando...\n"); // No es recomendable el printf en una funcion, lo mantengo para mostrar el
                                        // proceso.
                resultado = resultado + 1;
            }
        } else {
            for (int i = otro_numero; i < 0; i++) {
                System.out.printf("Sumando...\n");
                resultado = resultado - 1;
            }
        }
        return resultado;
    }
}