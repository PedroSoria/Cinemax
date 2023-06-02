
package entities;

import java.util.ArrayList;


public class Cine {
    
    private Pelicula pelicula;
    private ArrayList<Asiento>sala;
    private Integer precio; 

    public Cine() {
        
        this.sala=new ArrayList();
        
    }

    public Cine(Pelicula pelicula, ArrayList<Asiento> sala, Integer precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Asiento> getSala() {
        return sala;
    }

    public void setSala(ArrayList<Asiento> sala) {
        this.sala = sala;
    }
    
       public void setUnabutaca(Asiento asiento) {
        sala.add(asiento);
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", sala=" + sala + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
    
    
}
