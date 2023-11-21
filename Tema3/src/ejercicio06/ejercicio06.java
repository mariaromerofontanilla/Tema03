package ejercicio06;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio de la base del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Introduce la altura del cilindro: ");
        double altura = scanner.nextDouble();

        System.out.print("Introduce la opción (1 para área, 2 para volumen): ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            double area = calcularAreaCilindro(radio, altura);
            System.out.println("El área del cilindro es: " + area);
        } else if (opcion == 2) {
            double volumen = calcularVolumenCilindro(radio, altura);
            System.out.println("El volumen del cilindro es: " + volumen);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    // Función para calcular el área de un cilindro
    public static double calcularAreaCilindro(double radio, double altura) {
        return 2 * Math.PI * radio * (radio + altura);
    }

    // Función para calcular el volumen de un cilindro
    public static double calcularVolumenCilindro(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }
}