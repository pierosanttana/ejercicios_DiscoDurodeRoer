package ejercicios;

public class OperacionesMatematicasSimples {

	public static void main(String[] args) {
		
		// 2. Realizar la suma, resta, multiplicación, división y resto de dos números.
		
		//Crear 2 variables numericas
		
		int numero1 = 10;
		int numero2 = 3;
		
		//Suma
		
		int suma = numero1 + numero2;
		System.out.println("Suma: " + suma);
		
		//Resta
		
		int resta = numero1 - numero2;
		System.out.println("Resta: " + resta);
		
		//Multiplicación
		
		int multiplicacion = numero1 * numero2;
		System.out.println("Multiplicación: " + multiplicacion);
		
		//División
		//Debe ser casteada para que muestre el numero decimal
		double division = (double)numero1 / numero2;
		System.out.println("Division: " + division);
		
		//Resto
		
		int resto = numero1 % numero2;
		System.out.println("Resto: " + resto);
		

	}

}
