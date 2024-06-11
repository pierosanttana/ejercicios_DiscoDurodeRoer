package ejercicios;

import javax.swing.JOptionPane;

public class E14_ConvertirMayuMinu {

	public static void main(String[] args) {
		
	//14. Convertir una frase a mayúscula o minúsculas, que daremos opción a que 
	//el usuario lo pida y mostraremos el resultado por pantalla.

		
		
		String texto = JOptionPane.showInputDialog(null,
													"Ingresa una frase:",
													"Convertir Mayuscula o Minuscula",
													JOptionPane.INFORMATION_MESSAGE);
		
		/*
		int eleccion = JOptionPane.showConfirmDialog(null, "¿Quieres que se pase a Mayusculas?", "Elección", JOptionPane.YES_NO_OPTION);
		
		char caracterActual = ' ';
		String cadenaResultante = "";
		final int DIFERENCIA = 32;
		
		boolean isMayus = false;
		
		isMayus = eleccion == JOptionPane.YES_OPTION;
		
		for(int i = 0; i < texto.length(); i++) {
			caracterActual = texto.charAt(i);
			
			if(isMayus) {
				if(caracterActual >= 97 && caracterActual <= 122) {
					cadenaResultante += (char)(caracterActual - DIFERENCIA);
				}else {
					cadenaResultante += caracterActual;
				}
			}else {
				if(caracterActual >= 65 && caracterActual <= 90) {
					cadenaResultante += (char)(caracterActual + DIFERENCIA);
				}else {
					cadenaResultante += caracterActual;
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, cadenaResultante, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		*/
		
		
		
		if(texto != null) {
			String[] arrayOpcion = {"Mayuscula", "Minuscula"};
			
			int opcion = JOptionPane.showOptionDialog(null, "Elige una opción:", "Elección", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, arrayOpcion, arrayOpcion[1]);
					
			
			switch(opcion) {
			case 0:
				texto = texto.toUpperCase();
				break;
			case 1:
				texto = texto.toLowerCase();
				break;
			case 2:
				break;
			}
			
		
				JOptionPane.showMessageDialog(null, texto, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "No has ingresado ninguna frase.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		
	}

}
