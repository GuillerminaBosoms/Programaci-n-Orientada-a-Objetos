

package herencia;


public class Test {
    public static void main(String[] args) {
        //creo un vehiculo y un avion
        Vehiculo v = new Vehiculo("negro", 25);
        Avion a = new Avion(100, "blanco", 800);
        
        //comportamiento
        
        //muestro el estado de los objetos
        System.out.println(v);
        System.out.println("----------------------");
        System.out.println(a);
    }
}



