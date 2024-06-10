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
		
		boolean isMayus = false;
		
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
			}
			
			
				JOptionPane.showMessageDialog(null, texto, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "No has ingresado ninguna frase.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
