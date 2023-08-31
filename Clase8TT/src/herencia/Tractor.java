package herencia;

public class Tractor extends Vehiculo{
    //atributos
    private int carga;

    //constructores
    public Tractor() {}

    public Tractor(int carga, String color, int velocidad) {
        super(color, velocidad);
        this.setCarga(carga);
    }
    
    //getters y setters
    public int getCarga() {
        return carga;
    }

    public final void setCarga(int carga) {
        //regla de negocio
        if (carga >= 0) {
            this.carga = carga;
        } else {
            System.out.println("Carga incorrecta");
        }
        
    }
    
    //metodos
    @Override
    public String toString() {
        return super.toString() + " carga=" + carga;
    }
}
