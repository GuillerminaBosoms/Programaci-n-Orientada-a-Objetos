package constructores;

public class Auto {
    //atributos
    public String marca;
    public int velocidad;
    
    //constructor vacio
    public Auto() {}
    
    //constructor sobrecargado
    public Auto(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }
    
    
    //metodos
    //acelerar sin sobrecarga
    public void acelerar() {
        this.velocidad += 10;
    }
    
    //acelerar sobrecargado con 1 parametro
    public void acelerar(int km) {
        this.velocidad += km;
    }
    
    //acelerar sobrecargado con 2 parametros
    public void acelerar(int km, boolean  turbo) {
        if (turbo) {
            this.acelerar(km * 2);
        } else {
            this.acelerar(km);
        }
    }
    
    public void frenar(int km) {
        this.velocidad -= km;
    }

    @Override
    public String toString() {
        return "marca=" + marca + ", velocidad=" + velocidad;
    }
}
