
package services;

import entities.Persona;
import java.util.Scanner;


public class PersonaServicio {
    
    public void crearPersona(){
      
    Persona persona = new Persona();
    
      Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("nombre");
        persona.setNonbre(scan.next());
        System.out.println("Edad");
        persona.setEdad(scan.nextInt());
        System.out.println("Saldo");
        persona.setSaldo(scan.nextDouble());
        
            
    
    
    }
    
        
        
        
    }
    
    

