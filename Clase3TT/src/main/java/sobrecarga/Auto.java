package sobrecarga;
//EJEMPLO DE SOBRECARGA

public class Auto {
    //atributos
    public String marca;
    public int velocidad;

    //constructor 
    public Auto() {
    }

    //metodos
    //Acelerar sin sobrecarga
    public void acelerar() {
        this.velocidad += 10;
    }

    //Con este metodo sobrecargamos el primero
    //Sobrecargado con 1 parametro
    public void acelerar(int km) {
        this.velocidad += 10;
    }

    //Acelerar Sobrecargado con 2 parametro
    public void acelerar(int km, boolean turbo) {
        if (turbo) {
            this.acelerar(km*2);
        } else {
            this.acelerar(km);
        }
    }
    
    //boton derecho, insert code, toString
    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", velocidad=" + velocidad + '}';
    }  
}
