package ejercicios;

import java.util.Scanner;

public class E18_SepararPalabras {

	public static void main(String[] args) {
		
		//18. Dada una frase, separarlo en palabras.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa una frase:");
		
		String frase = scanner.nextLine();
		
		String[] fraseSeparada = frase.split(" ");
		
		System.out.println("La frase separada:");
		
		for (String s : fraseSeparada) {
			System.out.println(s);
		}

	}

}
