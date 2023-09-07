package polimorfismo;


public class AutoCarrera extends Auto{
    //atributos
    private String tipoDeAleron;
    
    //constructores
    public AutoCarrera() {}

    public AutoCarrera(String tipoDeAleron, String marca, int velocidad) {
        super(marca, velocidad);
        this.setTipoDeAleron(tipoDeAleron);
    }

    //getters y setters
    public String getTipoDeAleron() {
        return tipoDeAleron;
    }

    public final void setTipoDeAleron(String tipoDeAleron) {
        this.tipoDeAleron = tipoDeAleron;
    }
    
    //metodos
    @Override
    public String toString() {
        return super.toString() + " tipoDeAleron=" + tipoDeAleron;
    }
    
   //aplico polimorfismo al metodo heredado
    //dsd la clase padre (acelerar)
    @Override
    public void acelerar() {
        this.velocidad += 50;
    }
    
}













