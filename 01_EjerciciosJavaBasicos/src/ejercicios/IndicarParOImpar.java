package ejercicios;

import java.util.Scanner;

public class IndicarParOImpar {

	public static void main(String[] args) {
		// 4. Indicar si un número pasado por consola es par o no.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un número:");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("El número es par.");
		}
		else {
			System.out.println("El número es impar.");
		}
		
		
	}

}
