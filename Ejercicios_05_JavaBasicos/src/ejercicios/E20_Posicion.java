package ejercicios;

import java.util.Scanner;

public class E20_Posicion {

	public static void main(String[] args) {
		
		// 20. Dada una frase, determinar la posición de la primera 'a' y de la siguiente.
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa una frase:");
		
		String frase = scanner.nextLine();
		
		int pos = frase.indexOf('a');
		if(pos > -1) {
			System.out.println("'a' encontrada en la posición: " + pos);
			
			pos = frase.indexOf('a', pos + 1);
			if(pos > -1) {
			System.out.println("'a' encontrada en la posición: " + pos);
			}
		}else {
			System.out.println("Ninguna 'a' fue encontrada.");
		}
		/*
		for(int i = 0; i < frase.length(); i++) {
			
			switch(frase.charAt(i)) {
			case 'a':
				System.out.println("'a' encontrada en la posición: " + i);
				break;				
			}
		}
		*/

	}

}
