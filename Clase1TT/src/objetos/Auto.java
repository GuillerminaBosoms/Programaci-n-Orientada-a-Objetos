package objetos;

public class Auto {
    //Si no es publico o privado es ???
    //Una buena practica es que los atributos sean privados
    //copiar linea == ctrl shift para abajo
    //atributos
    public String marca;
    public String color;
    public int velocidad;
    
    //click derecho . insert code . lista . constructor. sin check. 
    //Ya nos genero el constructor  vacio por defecto
    //-- CREAR OBJETOS -- Constructor
    public Auto() {
        System.out.println("Creando un auto...");
    }
    
    //VOID no recibe o devuelve valores --- METODO PROCEDIMIENTO
    //STRING, INT,  retorna una cadena --- METODO FUNCION 
    public void acelerar() {
        velocidad += 10;
    }
    
    public void frenar() {
        velocidad -= 5;
    }    

    //alt + ins = toString 
    @Override //ANOTACION, ES UNA SOBREESCRITURA - PODEMOS QUITARLO, NO LO HAGAS
    public String toString() {
        return "Auto{" + "marca=" + marca + ", color=" + color + ", velocidad=" + velocidad + '}';
    }
    //PRIVADO = Solo la misma clase puede acceder al metodo.
    
    //La version LTS de Java sale ahora en septiembre 2021
    // VER VERSION DE JAVA ---
}