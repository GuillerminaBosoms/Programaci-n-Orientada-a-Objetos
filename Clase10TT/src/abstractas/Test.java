package abstractas;

public class Test {
    public static void main(String[] args) {
        //creo 3 objetos
        //no se puede crear objetos de Vehiculo x ser abstracta
//        Vehiculo v = new Vehiculo("verde", 0);
        Avion a = new Avion("Fly Bondi", "amarillo", 0);
        Bici b = new Bici("28","rojo", 0);
        
        //comportamiento
        a.acelerar();//0 -> 300
        b.acelerar();//0 -> 10
        
        
        //estado final
//        System.out.println("Vehiculo: " + v);
        System.out.println("Avion: " + a);
        System.out.println("Bici: " + b);
    }
}
