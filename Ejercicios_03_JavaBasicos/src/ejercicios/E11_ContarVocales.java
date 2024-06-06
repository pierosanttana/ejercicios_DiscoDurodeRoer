package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class E11_ContarVocales {

	public static void main(String[] args) {
		// 11. Contar cuantas vocales tiene una frase pasada por consola por el usuario.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa una frase:");
		String texto = scanner.nextLine(); //Recogemos la frase con Scanner
		texto = texto.toLowerCase(); //Convierto a minusculas toda la frase.
		
		int contador = 0;
		
		for(int i = 0; i < texto.length(); i++) {
			
			char caracter = texto.charAt(i); //Cojo un caracter para comparar
			
			switch(caracter) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				contador++;
				break;
			}			
		}
		
		System.out.println(contador);
		
		//Recojo la frase con JOptionPane
		String cadena = JOptionPane.showInputDialog(null, "Escriba una cadena: ", "Inserción", JOptionPane.INFORMATION_MESSAGE);
		cadena = cadena.toLowerCase();
		
		char vocales[] = {'a','e','i','o','u'}; //Array de vocales para comparar.
		
		contador = 0;
		
		// 2 bucles, uno para recorrer la Frase y el otro para comparar. 
		for(int i = 0; i < cadena.length(); i++) {
			
			char caracterActual = cadena.charAt(i); //Coje un caracter.
			
			for(int j = 0; j < vocales.length; j++) {
				
				if(caracterActual == vocales[j]) { //Compará el caracter con el Array
					contador++;
					break;
				}
				
			}
		}
		
		JOptionPane.showMessageDialog(null, "La frase tiene " + contador + " vocales." , "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
		

	}

}
