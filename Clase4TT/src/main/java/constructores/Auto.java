package constructores;
//EJEMPLO DE SOBRECARGA

public class Auto {
    //atributos
    public String marca;
    public int velocidad;

    //constructor vacio -->cuando no conozco los datos del auto
    public Auto() {}
    
    //El constructor es un metodo, la sobrecarga del contructor tiene la finalidad de 
    //constructor sobrecargado
    public Auto(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
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
    
    public void frenar(int km){
        this.velocidad -= km;
    }
    
    //boton derecho, insert code, toString
    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", velocidad=" + velocidad + '}';
    }  
}
