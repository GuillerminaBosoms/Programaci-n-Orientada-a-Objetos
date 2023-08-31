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

    //getters y setters
    public String getColor() {
        return color;
    }

    public final void setColor(String color) {
        //regla de negocio
        String [] colores = {"blanco","rojo","verde","azul","negro"};
        
        if (Arrays.asList(colores).contains(color.toLowerCase())) {
            this.color = color;
        } else {
            System.out.println("Color no valido");
        }
    }
    
    public int getVelocidad() {
        return velocidad;
    }

    public final void setVelocidad(int velocidad) {
        //regla de negocio
        if (velocidad >= 0) {
            this.velocidad = velocidad;
        } else {
            System.out.println("velocidad incorrecta");
        }
    }
    
    //metodos
    @Override
    public String toString() {
        return "color=" + color + ", velocidad=" + velocidad;
    }
}
