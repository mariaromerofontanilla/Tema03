package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		 System.out.print("Introduce el día: ");
	        int dia = scanner.nextInt();

	        System.out.print("Introduce el mes: ");
	        int mes = scanner.nextInt();

	        System.out.print("Introduce el año: ");
	        int año = scanner.nextInt();

	        if (esFechaValida(dia, mes, año)) {
	            System.out.println("La fecha introducida es válida.");
	        } else {
	            System.out.println("La fecha introducida NO es válida.");
	        }
	    }

	    // Función para verificar si la fecha es válida
	    public static boolean esFechaValida(int dia, int mes, int año) {
	        // Verificar si el año es bisiesto
	        boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

	        // Verificar la cantidad de días en el mes
	        switch (mes) {
	            case 1: // Enero
	            case 3: // Marzo
	            case 5: // Mayo
	            case 7: // Julio
	            case 8: // Agosto
	            case 10: // Octubre
	            case 12: // Diciembre
	                return (dia >= 1 && dia <= 31);
	            case 4: // Abril
	            case 6: // Junio
	            case 9: // Septiembre
	            case 11: // Noviembre
	                return (dia >= 1 && dia <= 30);
	            case 2: // Febrero
	                if (esBisiesto) {
	                    return (dia >= 1 && dia <= 29);
	                } else {
	                    return (dia >= 1 && dia <= 28);
	                }
	            default:
	                return false; // Mes inválido
	        }
	    }
	}