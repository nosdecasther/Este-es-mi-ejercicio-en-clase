
package Ejercicio;


public class Animal extends SerVivo {
    
    String clase, familia;

    public Animal(String clase, String familia, String Alimento, String reproduccion, String sexo, int edad) {
        super(Alimento, reproduccion, sexo, edad);
        this.clase = clase;
        this.familia = familia;
    }
    
    
    
}
