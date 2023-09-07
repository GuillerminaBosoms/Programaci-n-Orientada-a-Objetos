package interfaces;

public class Test {
    public static void main(String[] args) {
        //creo un gerente y un cadete
        Gerente g = new Gerente("Juan Perez", 300000, 10);
        Cadete c = new Cadete("Pedro Picapiedra", 1000, 160);
        
        //calculo el sueldo. comportamiento
        g.calcularSueldo();
        c.calcularSueldo();
    }
}
