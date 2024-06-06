package ejercicios;

import java.util.Scanner;

public class E10_AplicacionInsertarNumeros {

	public static void main(String[] args) {
		// 10. Crear una aplicación que nos permite insertar
		// numeros hasta que insertemos un -1, mostrar la cantidad de
		// numeros insertados.

		Scanner scanner = new Scanner(System.in);

		int numero = 0;
		int contador = 0;

		while (numero != -1) {
			System.out.println("Para terminar ingrese -1");
			System.out.println("Ingrese un número:");
			numero = scanner.nextInt();

			contador++;
		}
		contador--;

		System.out.println("Se ha insertado " + contador + " números.");
		System.out.println("Fin del programa.");

	}

}
