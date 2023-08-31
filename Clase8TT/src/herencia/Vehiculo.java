package herencia;
import java.util.Arrays;


public class Vehiculo {
    
    //atributos
    private String color;
    private int velocidad;
    
    //constructores
    public Vehiculo() {}

    public Vehiculo(String color, int velocidad) {
        this.setColor(color);
        this.setVelocidad(velocidad);
    }

    //getters  y setters
    public int getVelocidad() {
        return velocidad;
    }

    public final void setVelocidad(int velocidad) {
        //regla de negocio
        if (velocidad >= 0) {
            this.velocidad = velocidad;
        } else{
            System.out.println("velocidad incorrecta");
        }
    }


    public String getColor() {
        return color;
    }

    public final String setColor(String color) {
        //regla de negocio
        String [] colores = {"blanco", "azul", "rojo","negro", "gris"};
        
        if (Arrays.asList(colores).contains(color.toLowerCase()))
        {
            this.color = color;
            return "Color permitido";
        } 
        else 
        {
            System.out.println("color no valido");
            return "Color invalido";
        }
    }                   
    
    //metodos
    //metodos
    public void acelerar(int km) {
        this.setVelocidad(this.velocidad + km);
    }
    
    public void frenar(int km) {
        this.setVelocidad(this.velocidad - km);
    }
    
    @Override
    public String toString() {
        return "color=" + color + ", velocidad=" + velocidad;
    }
}










