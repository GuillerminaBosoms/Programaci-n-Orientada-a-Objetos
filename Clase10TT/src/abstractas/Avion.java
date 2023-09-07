package abstractas;

public class Avion extends Vehiculo{    
    
    //atributos
    private String aerolinea;

    //constructores
    public Avion() {}

    public Avion(String aerolinea, String color, int velocidad) {
        super(color, velocidad);
        this.setAerolinea(aerolinea);
    }

    //getters y setters
    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    
    //metodos
    @Override
    public String toString() {
        return super.toString() + " aerolinea=" + aerolinea;
    }
    
    //implemento el cuerpo del metodo abstracto acelerar
    //de la clase padre(Vehiculo)
    @Override
    public void acelerar() {
        this.velocidad += 300;
    }
    
}
