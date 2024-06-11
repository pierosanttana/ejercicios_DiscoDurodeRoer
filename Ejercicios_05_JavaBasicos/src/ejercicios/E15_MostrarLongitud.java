package ejercicios;

import java.util.Scanner;

public class E15_MostrarLongitud {

	public static void main(String[] args) {
		
		//15. Mostrar la longitud de una cadena.

		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Ingresa una cadena de texto:");
		
		String cadena = scanner.nextLine();
		
		System.out.println("La longitud de la cadena es de " + cadena.length() + " caracteres.");

	}

}
