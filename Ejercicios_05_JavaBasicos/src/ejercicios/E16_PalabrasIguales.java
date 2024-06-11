package ejercicios;

import java.util.Scanner;

public class E16_PalabrasIguales {

	public static void main(String[] args) {
		
		// 16. Pedir dos palabras por teclado, indicar si son iguales.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa una palabra:");
		String p1 = scanner.nextLine();
		
		System.out.println("Ingresa otra palabra:");
		String p2 = scanner.nextLine();
		
		boolean isIguales = false;
		
		if(p1.equals(p2)) {
			isIguales = true;
		}
		
		System.out.println("¿Las palabras son iguales?");
		System.out.println(isIguales);

	}

}
