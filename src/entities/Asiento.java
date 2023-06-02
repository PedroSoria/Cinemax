
package entities;

import services.num.ColumnasEnum;


public class Asiento {
    
    private Persona persona;
    private Integer id;
    private ColumnasEnum columnasEnum;

    public Asiento() {
    }
        public Asiento(Integer id, ColumnasEnum columnasEnum) {
        this.id = id;
        this.columnasEnum = columnasEnum;
    }

   
    public Asiento(Persona persona, Integer id, ColumnasEnum columnasEnum) {
        this.persona = persona;
        this.id = id;
        this.columnasEnum = columnasEnum;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ColumnasEnum getColumnasEnum() {
        return columnasEnum;
    }

    public void setColumnasEnum(ColumnasEnum columnasEnum) {
        this.columnasEnum = columnasEnum;
    }

    @Override
    public String toString() {
        return "Asiento{" + "persona=" + persona + ", id=" + id + ", columnasEnum=" + columnasEnum + '}';
    }

    
   
    }
    
    
    

