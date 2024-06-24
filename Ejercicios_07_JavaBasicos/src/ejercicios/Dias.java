package ejercicios;

public enum Dias {
	LUNES(true), 
	MARTES(true), 
	MIERCOLES(true), 
	JUEVES(true), 
	VIERNES(true), 
	SABADO(false), 
	DOMINGO(false);
	
	private boolean laborable;
	
	private Dias(boolean laborable) {
		this.laborable = laborable;
	}
	
	@Override
	public String toString() {
		if(laborable) {
			return "El dia "+ this.name() + " es laborable.";
		}else {
			return "El dia "+ this.name() + " no es laborable.";
		}
	}
	
}
