package polimorfismo;

public class Test {
    public static void main(String[] args) {
        //creo un auto y un auto de carrera
        Auto a = new Auto("Ford", 0);
        AutoCarrera ac = new AutoCarrera("titanio", "Ferrari", 0);
        
        //comportamiento
        a.acelerar();//0 -> 10
        ac.acelerar();//0 -> 50
        
        //muestro el estado
        System.out.println(a);
        System.out.println("---------------");
        System.out.println(ac);
        
    }
}
