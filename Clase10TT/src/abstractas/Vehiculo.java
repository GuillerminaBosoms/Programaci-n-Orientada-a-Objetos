package abstractas;

public abstract class Vehiculo {
    
    //atributos
    private String color;
    protected int velocidad;
    
    //constructores
    public Vehiculo() {}

    public Vehiculo(String color, int velocidad) {
        this.setColor(color);
        this.setVelocidad(velocidad);
    }

    //getters y setters
    public int getVelocidad() {
        return velocidad;
    }

    public final void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }
    
    //metodos
    @Override
    public String toString() {
        return "color=" + color + ", velocidad=" + velocidad;
    }
    
    //defino el metodo abstracto acelerar
    //Cada clase hija debe definir COMO va a acelerar
    public abstract void acelerar();
//    public abstract void frenar();
//    public abstract void chocar();
}
