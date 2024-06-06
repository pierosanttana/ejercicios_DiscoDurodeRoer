package ejercicios;

import java.util.Scanner;

public class E3_LeerPorTeclado {

	public static void main(String[] args) {
		// 3. Lee un número por teclado y muestra por consola, el caracter al que 
		// pertenece en la tabla ASCII
		//Ej: Si introduzco un 97, me muestre una 'a'.
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un número:");
		
		int numero = scanner.nextInt();
		
		char numeroASCII = (char)numero;
		
		System.out.println("El número en la tabla ASCII es el carácter: " + numeroASCII);

	}

}
