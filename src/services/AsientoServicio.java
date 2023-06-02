package services;

import entities.Asiento;
import entities.Cine;
import java.util.ArrayList;
import services.num.ColumnasEnum;

public class AsientoServicio {

    public void crearSala(int n) {

        Cine cine = new Cine();

        ArrayList<Asiento> sala = cine.getSala();

        for (ColumnasEnum asiento : ColumnasEnum.values()) {
            for (int i = 1; i < n; i++) {
                Asiento asientoA = new Asiento(i, asiento);
                sala.add(asientoA);
                
                System.out.println(asientoA);
                
                
            }   
        
         }
        
       
        

    }

}
