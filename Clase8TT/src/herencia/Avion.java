package herencia;

public class Avion extends Vehiculo{
    //atributos
    private String tipoDeMotor;
    
    //constructores
    public Avion() {}

    public Avion(String tipoDeMotor, String color, int velocidad) {
        //llamo al constructor del padre(Vehiculo)
        super(color, velocidad);
        
        this.setTipoDeMotor(tipoDeMotor);
    }
    
    //getters y setters
    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public final void setTipoDeMotor(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }
    
    //metodos
    @Override
    public String toString() {
        return super.toString() + " tipoDeMotor=" + tipoDeMotor;
    }
}









