
public class Espectador {
	String nombre;
	int edad;
	double dinero;
	
	public Espectador(String nombre,int edad,double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getDinero() {
		return dinero;
	}
	
}
