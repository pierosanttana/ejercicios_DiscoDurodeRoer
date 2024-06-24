package ejercicios;

import java.util.Scanner;

public class E24_EnumMeses {

	public static void main(String[] args) {
		
		EnumMes[] meses = EnumMes.values();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un número de dias: (28,30 o 31)");
		
		int dias = scanner.nextInt();
		
		for (EnumMes e : meses) {
			if(e.getNumDias() == dias) {
				System.out.println(e.toString());
			}
		}
		
		

	}

}
