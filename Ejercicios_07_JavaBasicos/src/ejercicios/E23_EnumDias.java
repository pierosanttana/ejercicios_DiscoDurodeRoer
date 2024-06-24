package ejercicios;

import java.util.Scanner;

public class E23_EnumDias {

	public static void main(String[] args) {
		// 23. Modifica el anterior enum para indicar que es dia 
		// laborable directamente (usar toString).
		
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe un dia de la semana:");
		
		String sDia = scanner.nextLine();
		
		Dias eDia = Dias.valueOf(sDia.toUpperCase());
		
		System.out.println(eDia.toString());

	}

}
