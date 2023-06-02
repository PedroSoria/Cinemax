
package services;

import entities.Cine;

public class CinexService {
    
    public void crearCine(){
        Cine cine = new Cine();
        AsientoServicio as = new AsientoServicio();
        as.crearSala(9);
    }

}
