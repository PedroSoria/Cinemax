
package entities;


public class Persona {
  
    private String nonbre;
    private int edad;
    private Double saldo;

    public Persona() {
    }

    public Persona(String nonbre, int edad, Double saldo) {
        this.nonbre = nonbre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getNonbre() {
        return nonbre;
    }

    public void setNonbre(String nonbre) {
        this.nonbre = nonbre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nonbre=" + nonbre + ", edad=" + edad + ", saldo=" + saldo + '}';
    }
    
    
}
