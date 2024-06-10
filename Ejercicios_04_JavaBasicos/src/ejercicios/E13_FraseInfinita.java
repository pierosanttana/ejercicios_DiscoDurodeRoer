package ejercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class E13_FraseInfinita {

	public static void main(String[] args) {
		
	//13. Pedir al usuario que nos escriba frases de forma infinita 
	//hasta que insertemos una cadena vacia. Mostrar la cadena resultante

		
		//Scanner
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¡Cadena Infinita!");
		
		String cadena = "";
		String frase = "";
		
		do{
			System.out.println("Para salir ingresa un espacio y pulsa enter.");
			System.out.println("Ingresa una frase:");
			
			frase = scanner.nextLine();
			
			cadena += frase + " ";
		
		}while(!frase.equals(" ")); 
		
		System.out.println("Resultado: " + cadena);
		*/
		
		//JOptionPane
		
		
		String texto = "";
		String frase = "";
		
		do{
		texto = JOptionPane.showInputDialog(null,
											"Ingresa una frase para agregar, o un espacio para salir.",
											"¡CADENA INFINITA!",
											JOptionPane.INFORMATION_MESSAGE);
		frase += texto + " ";
		}while(!texto.isEmpty());
		
		JOptionPane.showMessageDialog(null, frase, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
