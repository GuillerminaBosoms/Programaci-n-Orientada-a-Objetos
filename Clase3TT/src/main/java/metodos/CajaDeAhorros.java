package metodos;

public class CajaDeAhorros {

    //atributos
    public int saldo;
    public String moneda;

    //constructor = alt + inser
    public CajaDeAhorros() {
    }

    //metodos this.saldo === atributo
    public String consultarSaldo() {
        return "Saldo: " + this.saldo;
    }

    public void depositar(int monto) {
        this.saldo += monto;
    }

    public String extraer(int monto) {
        if (monto > this.saldo) {
            return "Fondos insuficientes";
        } else {
            this.saldo -= monto;
            return "Extraccion OK";
        }
    }
}
