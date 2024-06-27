package ejercicios;

public class E26_RelojDigital {

	public static void main(String[] args) {
		/*
		 * - Enunciado: 
		 * 26. Realiza un reloj digital que muestre la hora sin parar.
		 *  Debe esperar un segundo real para darle mas realismo.
		 */

		int horas = 0;
		int minutos = 59;
		int segundos = 55;

		while (true) {

			if (horas < 10) {
				System.out.print("0");
			}
			System.out.print(horas + ":");

			if (minutos < 10) {
				System.out.print("0");
			}
			System.out.print(minutos + ":");

			if (segundos < 10) {
				System.out.print("0");
			}
			System.out.println(segundos);

			segundos++;

			if (segundos == 60) {
				minutos++;
				segundos = 0;

			}

			if (minutos == 60) {
				horas++;
				minutos = 0;
			}

			if (horas == 24) {
				horas = 0;
				minutos = 0;
				segundos = 0;
			}

			try {
				// Ponemos a "Dormir" el programa durante los ms que queremos
				Thread.sleep(1 * 1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
