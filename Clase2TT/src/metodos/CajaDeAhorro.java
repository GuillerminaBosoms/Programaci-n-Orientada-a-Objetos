package metodos;

public class CajaDeAhorro {
    //atributos
    public int saldo;
    public String moneda;
    
    //constructor
    public CajaDeAhorro() {}

    //metodos -- VOID NI DEVUELVE, NI RECIBE
    // METODO PROCEDIMIENTO PORQUE NO DEVUELVE NINGUN VALOR
    // {} Entre llaves esta el cuerpo
    public String consultarSaldo() { 
        //soutv + tab
        return "saldo = " + this.saldo;
    }
    
    public void depositar(int monto) {  //METODO PROCEDIMIENTO NO DEVUELVE NADA
        this.saldo += monto;
    }
    
    public String extraer(int monto) { //METODO FUNCION DEVUELVE ALGO
        //ife
        if (monto > this.saldo) {
            return "Fondos insuficientes";
        } else {
            this.saldo -= monto;
            return "Extraccion OK";
        }
    }
    
}
