import java.util.Iterator;

public class Cine {
	
	protected Pelicula pelicula;
	protected double precio;
	protected int filas;
	protected int columnas;
	protected Asiento[][] asientos;
	
	public Cine(Pelicula pelicula, double precio, int filas, int columnas) {
		this.pelicula = pelicula;
		this.precio = precio;
		this.filas = filas;
		this.columnas = columnas;
        this.asientos = new Asiento[filas][columnas]; 
		rellenar(filas, columnas);
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public double getPrecio() {
		return precio;
	}

	public int getFilas() {
		return filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public Asiento[][] getAsientos() {
		return asientos;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void rellenar(int fil, int col) {
		for(int o = 0; o<fil; o++) {
			for(int i = 0; i<col; i++) {
				asientos[o][i] = new Asiento((char)(65+i),(8-o),false);
			}
		}
	}
	
	public boolean hayAsientos() {
	    for (int o = 0; o < asientos.length; o++) {
	        for (int i = 0; i < asientos[o].length; i++) {
	            if (asientos[o][i].isOcupado()) {
	                return true; 
	            }
	        }
	    }
	    return false; 
	}

	
}
