package services;

import entities.Pelicula;
import java.util.ArrayList;

public class PeliculaServicio {

    ArrayList<Pelicula> peliculas = new ArrayList();
    
    public void crearListaDePelicula() {
        peliculas.add(new Pelicula("Mario Bross", "Tarantino", 2, 17));
        peliculas.add(new Pelicula("Laberinto", "Juan", 2, 16));
        peliculas.add(new Pelicula("La casa de los locos", "Marcos", 2, 17));
        peliculas.add(new Pelicula("Los Adams", "no tengo idea", 2, 8));
        peliculas.add(new Pelicula(".....", "dd", 2, 16));
        peliculas.add(new Pelicula("fsadfsda", "ddd", 2, 17));
        peliculas.add(new Pelicula("fsdfdsa", "fds", 2, 8));
    }
    
    
    

}
