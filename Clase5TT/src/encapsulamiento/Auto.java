package encapsulamiento;

public class Auto {
    //atributos
    public String marca;
    private int velocidad;
    
    //constructor vacio
    public Auto() {}
    
    //constructor sobrecargado
    public Auto(String marca, int velocidad) {
        this.marca = marca;
//        this.velocidad = velocidad;
        this.setVelocidad(velocidad);
    }
    
    //getters y setters
    public int getVelocidad() {
        return velocidad;
    }

    public String setVelocidad(int velocidad) {
        //regla de negocio
        if (velocidad >= 0 && velocidad <= 100) 
        {
            this.velocidad = velocidad;
            return "Velocidad correcta";
        } 
        else
        {
            if (velocidad > 100) 
            {
                this.velocidad = 100;
            } 
            else 
            {
                    this.velocidad = 0;
            }
            System.out.println("Velocidad fuera de rango");
            return "Velocidad fuera de rango";
        }
        
    }

    //metodos
    //acelerar sin sobrecarga
    public void acelerar() {
        this.velocidad += 10;
    }
    
    //acelerar sobrecargado con 1 parametro
    public String acelerar(int km) {
//        this.velocidad += km;
          return this.setVelocidad(velocidad + km);
    }
    
    //acelerar sobrecargado con 2 parametros
    public void acelerar(int km, boolean  turbo) {
        if (turbo) {
            this.acelerar(km * 2);
        } else {
            this.acelerar(km);
        }
    }
    
    public String frenar(int km) {
//        this.velocidad -= km;
        return this.setVelocidad(velocidad - km);
    }

    @Override
    public String toString() {
        return "marca=" + marca + ", velocidad=" + velocidad;
    }
}
