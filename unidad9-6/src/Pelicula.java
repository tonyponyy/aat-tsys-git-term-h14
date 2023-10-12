public class Pelicula {
	String titulo;
	int duracion;
	int edad_minima;
	String director;
	
	
	
	public Pelicula(String titulo,int duracion,int edad_minima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edad_minima = edad_minima;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getEdad_minima() {
		return edad_minima;
	}

	public String getDirector() {
		return director;
	}
	
	
	
}