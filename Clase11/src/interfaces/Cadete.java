package interfaces;

public class Cadete implements Empleado{
    //atributos
    private String nombre;
    private int valorHora;
    private int horas;
    
    //constructores
    public Cadete() {}

    public Cadete(String nombre, int valorHora, int horas) {
        this.setNombre(nombre);
        this.setValorHora(valorHora);
        this.setHoras(horas);
    }
    
     //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    //metodos
    @Override
    public String toString() {
        return "Cadete{" + "nombre=" + nombre + ", valorHora=" + valorHora + ", horas=" + horas + '}';
    }
    
    //implementamos el metodo abstracto de la interface(calcularSueldo)
    @Override
    public void calcularSueldo() {
        System.out.println("Sueldo cadete = " + valorHora * horas + " $");
    }
}
