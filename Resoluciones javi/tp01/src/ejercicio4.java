import java.util.Scanner;

public class ejercicio4 {
    /*
     * Ejercicio 7. Potencia lenta
     * Javier Ingusci (jingusci)
     * Comision 3 - 2023
     * Programacion 1 - Ingenieria en computacion
     */

    public static void main(String[] args) {

        // Creación de un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitud de numeros (flotantes)
        System.out.printf("Ingrese base: ");
        int numero = scanner.nextInt();
        System.out.printf("Ingrese exponente: ");
        int exponente = scanner.nextInt();

        // Funcion
        int resultado = potencia_lenta(numero, exponente);

        // Muestra de resultados
        System.out.printf("%d elevado a %d es igual a: %d", numero, exponente, resultado);
    }

    /**
     * Esta función realiza la potencia de un número mediante multiplicaciones
     * sucesivas.
     *
     * @param numero    El número base.
     * @param exponente El exponente al que se elevará el número.
     *
     * @return El resultado de la potencia.
     *
     */
    public static int potencia_lenta(int numero, int exponente) {
        int resultado = 1;
        int flag_signo = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado = multiplicar(resultado, numero);
        }

        resultado = multiplicar(resultado, flag_signo);
        return resultado;
    }

    /**
     * Esta función realiza la multiplicación de dos números enteros.
     *
     * @param num1 El primer número a multiplicar.
     * @param num2 El segundo número a multiplicar.
     *
     * @return El resultado de la multiplicación.
     *
     */
    public static int multiplicar(int num1, int num2) {
        int producto = 0;
        int abs_num1 = num1, abs_num2 = num2;

        //
        if (num1 < 0) {
            abs_num1 = -num1;
        }
        if (num2 < 0) {
            abs_num2 = -num2;
        }

        for (int i = 1; i <= abs_num1; i++) {
            producto += abs_num2;
        }

        if ((num1 > 0 && num2 < 0) || (num1 < 0 && num2 > 0)) {
            producto = -producto;
        }

        return producto;
    }

}
