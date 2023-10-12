
public class main_app {
	public static void main(String[] args) {
		System.out.println("ejercicio 6");

		Pelicula pelicula1 = new Pelicula("Harry Potter: el prisonero de Azkaban", 137, 12, "Alfonso Cuarón");
		Pelicula pelicula2 = new Pelicula("Doce hombres sin piedad", 95, 16, "Sidney Lumet");
		Pelicula pelicula3 = new Pelicula("El señor de los anillos: Las dos torres", 179, 12, "Peter Jackson");

		Espectador espectador1 = new Espectador("Jorge", 12, 9);
		Espectador espectador2 = new Espectador("María", 15, 8);
		Espectador espectador3 = new Espectador("Pedro", 45, 10);
		Espectador espectador4 = new Espectador("Laura", 14, 7);
		Espectador espectador5 = new Espectador("Carlos", 16, 6);
		Espectador espectador6 = new Espectador("Ana", 3, 8);
		Espectador espectador7 = new Espectador("Luis", 33, 5);
		Espectador espectador8 = new Espectador("Isabel", 9, 9);

		Pelicula[] peliculas = { pelicula1, pelicula2, pelicula3 };
		Pelicula pelicula_random = peliculas[(int) (Math.random() * peliculas.length)];
		Espectador[] espectadores = { espectador1, espectador2, espectador3, espectador4, espectador5, espectador6,
				espectador7, espectador8 };
		Cine yelmo = new Cine(pelicula_random, 9, 8, 18);

		for (int i = 0; i < espectadores.length; i++) {
			if (yelmo.getPrecio() <= espectadores[i].getDinero()) {
				if (yelmo.getPelicula().getEdad_minima() >= espectadores[i].getEdad()) {
					if (yelmo.hayAsientos()) {
						if (yelmo)
					} else {
						System.out.println("No quedan asientos");
					}

				} else {
					System.out.println(
							"El espectador " + espectadores[i].getNombre() + " no tiene edad para ver la película");
				}

			} else {
				System.out.println("El espectador " + espectadores[i].getNombre() + " no tiene suficiente saldo");
				System.out.println();
			}
		}
	}
}
