package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E21_Menu {

	public static void main(String[] args) {
		// 21. Crea un menu con distintas opciones en Java.
		// Que controle si una opcion no esta dentro del rango.

		Scanner scanner = new Scanner(System.in);
		boolean salir = false;

		while (!salir) {
			System.out.println("Menu");
			System.out.println("1. ");
			System.out.println("2. ");
			System.out.println("3. ");
			System.out.println("4. ");
			System.out.println("5. Salir");
			try {
			System.out.println("Elige una opción");

			//Si se recoge la opcion como String no haria falta utilizar un try-catch
			int opcion = scanner.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("Haz elegido la opción 1");
					break;
				case 2:
					System.out.println("Haz elegido la opción 2");
					break;
				case 3:
					System.out.println("Haz elegido la opción 3");
					break;
				case 4:
					System.out.println("Haz elegido la opción 4");
					break;
				case 5:
					System.out.println("Fin del programa");
					salir = true;
					break;
				default:
					System.out.println("Las opciones van del 1 al 5.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes introducir un número.");
				scanner.next();
			}
		}

	}

}
