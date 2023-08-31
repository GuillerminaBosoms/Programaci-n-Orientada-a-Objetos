package herencia;

public class Test {
    public static void main(String[] args) {
        //creo un vehiculo y un avion
        Vehiculo v = new Vehiculo("blanco", 25);
        Avion a = new Avion("turbina", "blanco", 800);
        Tractor t = new Tractor(10, "rojo", 10);
        
        //comportamiento
        v.acelerar(40);
        a.acelerar(100);
        t.acelerar(15);
        
        //muestro el estado final 
        System.out.println(v);
        System.out.println("-----------------------");
        System.out.println(a);
        System.out.println("-----------------------");
        System.out.println(t);
    }
}
