
package entities;


public class Pelicula {
  
    private String titulo;
    private String director;
    private Integer duracion;
    private Integer edad;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion, Integer edad) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edad = edad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", edad=" + edad + '}';
    }
    
    
    
}
