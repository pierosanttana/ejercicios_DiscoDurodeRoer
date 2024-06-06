package ejercicios;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class E12_EliminarEspacios {

	public static void main(String[] args) {
		// 12. Eliminar los espacios de una frase pasada por consola por el usuario.
		
		String frase = JOptionPane.showInputDialog(null, "Ingresa una frase", "Inserción", JOptionPane.INFORMATION_MESSAGE);
		
		String[] arrayFrase = frase.split(" ");
		String fraseNueva = "";
		
		for(int i = 0; i < arrayFrase.length; i++) {
			fraseNueva += arrayFrase[i];
		}
		
		JOptionPane.showMessageDialog(null,fraseNueva,"Resultado", JOptionPane.INFORMATION_MESSAGE);
		

	}

}
