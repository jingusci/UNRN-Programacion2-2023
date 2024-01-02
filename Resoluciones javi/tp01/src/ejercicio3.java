
/**
 * Javier Ingusci
 * javieringusci
 * UNRN Andina - Programación 2
 */

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        // Declaracion de variable
        int dividendo;
        int divisor;
        int cociente;
        int resto;

        // Creación de un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitud de numeros
        System.out.printf("ingrese el dividendo: ");
        dividendo = scanner.nextInt();
        System.out.printf("ingrese el divisor: ");
        divisor = scanner.nextInt();

        // Funciones
        cociente = cociente_lento(dividendo,divisor);
        resto = division_lenta(dividendo,divisor);
        
        // Muestra de resultados
        System.out.printf("%d dividido %d es igual a %d con resto %d",dividendo,divisor,cociente,resto);
    }

    /**
     * Esta función realiza la "división lenta" obteniendo el resto.
     *
     * @param dividendo El número que será dividido.
     * @param divisor   El número por el cual se realizará la división.
     *
     * @return El resto de la división.
     *
     * @pre divisor no puede ser cero.
     *
     * 
     */
    public static int division_lenta(int dividendo, int divisor) {
        // creo el resto igual al dividendo
        int resto = dividendo;

        // Bucle que realiza la "división lenta"
        while (resto >= divisor) {
            resto = resto - divisor;
        }
        return resto;
    }

    /**
     * Esta función realiza la "división lenta" obteniendo el cociente.
     *
     * @param dividendo El número que será dividido.
     * @param divisor   El número por el cual se realizará la división.
     *
     * @return El cociente de la división.
     *
     * @pre divisor no puede ser cero.
     *
     */
    public static int cociente_lento(int dividendo, int divisor) {
        // inicio el resultado en cero
        int cociente = 0;

        // creo el resto igual al dividendo
        int resto = dividendo;

        // Bucle que realiza la "división lenta"
        while (resto >= divisor) {
            resto = resto - divisor;
            cociente++;
        }
        return cociente;
    }

}
