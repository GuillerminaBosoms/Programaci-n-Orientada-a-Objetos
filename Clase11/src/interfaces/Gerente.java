package interfaces;

public class Gerente implements Empleado{
    
    //atributos
    private String nombre;
    private int basico;
    private int antiguedad;

    //constructores
    public Gerente() {}

    public Gerente(String nombre, int basico, int antiguedad) {
        this.setNombre(nombre);
        this.setBasico(basico);
        this.setAntiguedad(antiguedad);
    }
    
    //getters y setters
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


    public int getBasico() {
        return basico;
    }

    public void setBasico(int basico) {
        this.basico = basico;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //metodos
    @Override
    public String toString() {
        return "Gerente{" + "nombre=" + nombre + ", basico=" + basico + ", antiguedad=" + antiguedad + '}';
    }
    
    //implementamos el metodo abstracto de la interface(calcularSueldo)
    @Override
    public void calcularSueldo() {
        System.out.println("Sueldo gerente = " + (basico + basico * antiguedad * 0.05) + " $");
    }
    
}
















