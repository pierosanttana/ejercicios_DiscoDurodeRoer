package ejercicios;

public class E8_MostrarDivisibles {

	public static void main(String[] args) {
		// 8. Mostrar del 1 al 100 y que sean divisibles entre 2 y 3 (ambos)
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 2 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
