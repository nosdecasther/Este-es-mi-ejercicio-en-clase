
package Ejercicio;

public abstract class SerVivo {
    
    private String Alimento, reproduccion, sexo;
    private int edad;

    public SerVivo(String Alimento, String reproduccion, String sexo, int edad) {
        this.Alimento = Alimento;
        this.reproduccion = reproduccion;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
