package ejercicios;

import java.util.Scanner;

public class E5_MayorMenorOIgual {

	public static void main(String[] args) {
		// 5. Pedir 2 números por teclado e indicar si uno es mayor que el otro o si son iguales.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un número:");
		int numero1 = scanner.nextInt();
		
		System.out.println("Ingresa otro número:");
		int numero2 = scanner.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("El número " + numero1 + " es mayor que " + numero2 + ".");
		}else if(numero1 == numero2) {
			System.out.println("Los numeros son iguales.");
		}else {
			System.out.println("El número " + numero2 + " es mayor que " + numero1 + ".");
		}

	}

}
