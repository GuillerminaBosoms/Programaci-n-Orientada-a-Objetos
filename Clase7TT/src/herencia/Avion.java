package herencia;

public class Avion extends Vehiculo{
    //atributos
    private int capacidad;

    //constructores
    public Avion() {}

    public Avion(int capacidad, String color, int velocidad) {
        //llamo al constructor del padre(Vehiculo)
        super(color, velocidad);
        
        this.setCapacidad(capacidad);
    }
    
    //getters y setters
    public int getCapacidad() {
        return capacidad;
    }

    public final void setCapacidad(int capacidad) {
        //regla de negocio
        if (capacidad >= 0) {
            this.capacidad = capacidad;
        } else {
            System.out.println("capacidad incorrecta");
        }
    }
    
    //metodos
    @Override
    public String toString() {
        return super.toString() + " capacidad=" + capacidad;
    }
}



