package ejercicios;

import java.util.Scanner;

public class E28_TorosYVacas {

	public static void main(String[] args) {
		/*
		 * un jugador escribe un número de 4 dígitos y lo mantiene en secreto. Las
		 * cifras deben ser todas diferentes, no se debe repetir ninguna dentro del
		 * mismo número. El otro jugador trata de adivinar el número secreto en varios
		 * intentos que son anotados y numerados. En cada intento anota una cifra de
		 * cuatro dígitos completa, ésta es evaluada por el jugador que guarda el número
		 * secreto. Si una cifra está presente y se encuentra en el lugar correcto es
		 * evaluada como un toro, si una cifra está presente pero se encuentra en un
		 * lugar equivocado es evaluada como una vaca. La evaluación se anota al lado
		 * del intento y es pública.
		 */

		int numSeleccionado = 0;
		int toro = 0;
		int vaca = 0;
		boolean fin = false;
		int intento = 1;
		String num = "";

		Scanner scanner = new Scanner(System.in);

		String[] nSecreto = generarNumeroAleatorio();
		System.out.println("¡Numero secreto generado!");

		for (String string : nSecreto) {
			System.out.print(string);
		}
		System.out.println();
		System.out.println();
		System.out.println();

		

		System.out.println("TOROS Y VACAS");
		System.out.println("¡Adivina!");
		do {
		String[] numero = pedirNumeros(scanner);
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < nSecreto.length; j++) {
				if (numero[i].equals(nSecreto[j])) {
					if (i == j) {
						toro++;
					} else if (i != j) {
						vaca++;
					}
				}
			}
		}
		if (toro == 4) {
			System.out.println("¡Adivinaste el número!");
			fin = true;
		} else {
			for (String s : numero) {
				num += s;
			}
			System.out.println("Intento - Número - Evaluación");
			System.out.println("   " + intento + "       " + num + "      " +toro + "T" + vaca + "V");
			intento++;
			toro = 0;
			vaca = 0;
			num = "";
		}
		}while(!fin);

	}// main

	private static String[] generarNumeroAleatorio() {
		String[] num = { "a", "a", "a", "a" };

		for (int i = 0; i < num.length; i++) {
			int numero = (int) (Math.random() * 9 + 1);
			String sNumero = Integer.toString(numero);
			boolean nExiste = false;

			switch (sNumero) {
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				for (String s : num) {
					if (s.equals(sNumero)) {
						nExiste = true;
						i--;
						break;
					}
				}
				if (!nExiste) {
					num[i] = sNumero;
				}
				nExiste = false;
				break;
			default:
				i--;
			}
		}
		return num;
	}

	private static String[] pedirNumeros(Scanner scanner) {
		String[] num = { "a", "a", "a", "a" };

		System.out.println("Debes ingresar un número de 4 digitos que no se repitan:");
		String numero = scanner.nextLine();

		for (int i = 0; i < num.length; i++) {
			System.out.println("Digito " + (i + 1) + ": (Entre el 0 - 9)");
			boolean nExiste = false;

			switch (numero) {
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				for (String s : num) {
					if (s.equals(numero)) {
						nExiste = true;
						System.out.println("Número ingresa incorrecto, vuelve a intentarlo");
						i--;
						break;
					}
				}
				if (!nExiste) {
					num[i] = numero;
				}
				nExiste = false;
				break;
			default:
				System.out.println("Número ingresa incorrecto, vuelve a intentarlo");
				i--;
			}
		}
		return num;
	}

}// class
