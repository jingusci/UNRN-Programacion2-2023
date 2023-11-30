package programacion.practica;


import java.util.Scanner;

class ScanApp {
	public static void main(String[] args) {
     Scanner lector = new Scanner(System.in);
    	int var = lector.nextInt();
    	System.out.printf("Hola %d!\n", var);
	}
}

