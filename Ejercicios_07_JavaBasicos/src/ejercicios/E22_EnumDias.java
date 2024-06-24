package ejercicios;

import java.util.Scanner;

public class E22_EnumDias {

	public static void main(String[] args) {
		
		//22. Crea un enum con los dias de la semana, pide un dia de la semana 
		//e indica si es laboral o no (en el main).
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe un dia de la semana:");
		
		String sDia = scanner.nextLine();
		
		Dias dia = Dias.valueOf(sDia.toUpperCase());
		
		
		switch(dia) {
		case LUNES:
		case MARTES:
		case MIERCOLES:
		case JUEVES:
		case VIERNES:
			System.out.println("Es laborable :( ");
			break;
		case SABADO:
		case DOMINGO:
			System.out.println("Es fin de semana! :) ");
			break;
		default:
			System.out.println("No es un día de la semana.");
			break;
		}
		
		

	}

}
