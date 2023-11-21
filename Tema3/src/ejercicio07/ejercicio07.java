package ejercicio07;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }

    // Función para verificar si un número es primo o no
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}