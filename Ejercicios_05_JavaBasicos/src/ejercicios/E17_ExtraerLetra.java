package ejercicios;

import java.util.Scanner;

public class E17_ExtraerLetra {

	public static void main(String[] args) {
		
		//17. Dada una cadena, extraer la cuarta y quinta letra usando el metodo substring.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa una cadena de texto:");
		
		String cadena = scanner.nextLine();
		
		System.out.println(cadena);
		
		System.out.println("La cuarta y quinta letra es: " + cadena.substring(3, 5));
		

	}

}
