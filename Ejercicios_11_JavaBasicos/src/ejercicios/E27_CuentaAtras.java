package ejercicios;

public class E27_CuentaAtras {

	public static void main(String[] args) {
		/*
		 * Enunciado: 27. Realiza una cuenta atras con horas, minutos y segundos.
		 */

		int hora = 1;
		int minuto = 0;
		int segundo = 10;

		while (hora != 0 || minuto != 0 || segundo != 0) {

			imprimirhora(hora, minuto, segundo);
			
			
			if(segundo == 0) {
				
				if(minuto == 0) {
					hora--;
					minuto = 59;
					segundo = 59;
				}else if (minuto != 0) {
					minuto--;
					segundo = 59;
					
				}
			}else {
				segundo--;
			}
			
			

		}
		
		imprimirhora(hora, minuto, segundo);
		System.out.println("¡¡TIEMPO AGOTADO!!");

	}

	private static void imprimirhora(int hora, int minuto, int segundo) {
		if (hora < 10) {
			System.out.print(0);
		}
		System.out.print(hora + ":");

		if (minuto < 10) {
			System.out.print(0);
		}
		System.out.print(minuto + ":");

		if (segundo < 10) {
			System.out.print(0);
		}
		System.out.println(segundo);

	}

}
