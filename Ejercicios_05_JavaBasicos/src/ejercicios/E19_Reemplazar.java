package ejercicios;

import java.util.Scanner;

public class E19_Reemplazar {

	public static void main(String[] args) {
		
		//19. Dada una frase, reemplazar las 'a' por 'e' y las 'i' por 'o'.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa una frase:");
		
		String frase = scanner.nextLine();
		
		frase = frase.replace('a', 'e');
		frase = frase.replace('i', 'o');
		
		System.out.println("Nueva frase: " + frase);

	}

}
