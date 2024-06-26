package ejercicios;

import java.util.Scanner;

public class E25_PedirNumeros {

	public static void main(String[] args) {
		/*
		 * - Enunciado:
		 * 25. Pedir numeros al usuario y cuando el usuario meta un -1 se 
		 * terminará el programa.
		 * 
		 * Al terminar, mostrará lo siguiente:
		 * - mayor numero introducido
		 * - menor numero introducido
		 * - suma de todos los numeros
		 * - suma de los numeros positivos
		 * - suma de los numeros negativos
		 * - media de la suma (la primera que pido)
		 * 
		 * El número -1 no contara como número
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		int numeroMayor = 0;
		int numeroMenor = 0;
		int sumaTotal = 0;
		int sumaPositivos = 0;
		int sumaNegativos = 0;
		int contador = 0;
		do {
			System.out.println("Ingresa un número:");
			System.out.println("Para salir ingresa '-1'");
			numero = scanner.nextInt();
			
			
			if(numero == -1) {
				break;
			}
			
			if(numero > numeroMayor || numeroMayor == 0) {
				numeroMayor = numero;
			}
			
			if(numero < numeroMenor || numeroMenor == 0) {
				numeroMenor = numero;
			}
			
			if(numero > 0) {
				sumaPositivos += numero;
				contador++;
			}else{
				sumaNegativos += numero;
			}
			
		}while(numero != -1);

		sumaTotal = sumaPositivos + sumaNegativos;
		
		double mediaSumaPos = sumaPositivos / contador;
		
		System.out.println("El numero mayor introducido es: " + numeroMayor);
		System.out.println("El numero menor introducido es: " + numeroMenor);
		System.out.println("La suma de todos los numeros es: " + sumaTotal);
		System.out.println("La suma de todos los numeros positivos es: " + sumaPositivos);
		System.out.println("La suma de todos los numeros negativos es: " + sumaNegativos);
		System.out.println("La media de la suma de positivos es: " + mediaSumaPos);
		
	}

}
