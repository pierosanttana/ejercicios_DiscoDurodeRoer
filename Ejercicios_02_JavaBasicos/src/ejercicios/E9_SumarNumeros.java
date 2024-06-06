package ejercicios;

import java.util.Scanner;

public class E9_SumarNumeros {

	public static void main(String[] args) {
		// 9. Realizar la suma del 1 al numero que indiquemos, este debe ser 
		// mayor que 1.
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		
		do {
		System.out.println("Ingresa un número mayor a 1: ");
		numero = scanner.nextInt();
		
		if(numero <= 1) {
			System.out.println("Número ingresado incorrecto.");
		}
		}while(numero <= 1);
		
		int suma = 0;
		
		for(int i = 1; i <= numero; i++) {
			suma += i;
		}
		
		System.out.println("La suma de los números desde el 1 hasta el " + numero + " es: "  + suma);

	}

}
