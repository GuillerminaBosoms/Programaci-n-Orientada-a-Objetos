package polimorfismo;

public class Auto {
    //atributos
    private String marca;
    protected int velocidad;
    
    //constructores
    public Auto() {}

    public Auto(String marca, int velocidad) {
        this.setMarca(marca);
        this.setVelocidad(velocidad);
    }

    //getters y setters
    public int getVelocidad() {
        return velocidad;
    }

    public final void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public String getMarca() {
        return marca;
    }

    public final void setMarca(String marca) {
        this.marca = marca;
    }
    
    //metodos
    @Override
    public String toString() {
        return "marca=" + marca + ", velocidad=" + velocidad;
    }
    
    public void acelerar() {
        this.velocidad += 10;
    }
}
