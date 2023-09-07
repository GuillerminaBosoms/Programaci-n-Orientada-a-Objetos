package abstractas;

public class Bici extends Vehiculo{
    //atributos
    private String rodado;

    //constructores
    public Bici() {}

    public Bici(String rodado, String color, int velocidad) {
        super(color, velocidad);
        this.setRodado(rodado);
    }
    
    //getters y setters
    public String getRodado() {
        return rodado;
    }

    public final void setRodado(String rodado) {
        this.rodado = rodado;
    }
    
    //metodos
    @Override
    public String toString() {
        return super.toString() + " rodado=" + rodado;
    }
    
    //implemento el cuerpo del metodo abstracto acelerar
    //de la clase padre(Vehiculo)
    @Override
    public void acelerar() {
        this.velocidad += 10;
    }
}
