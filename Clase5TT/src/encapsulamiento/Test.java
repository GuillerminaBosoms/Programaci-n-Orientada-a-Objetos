

package encapsulamiento;


public class Test {
    public static void main(String[] args) {
        //creo 2 autos
        Auto a = new Auto();
        Auto b = new Auto("Chevy", 70000);
        
        a.marca = "Ford";
//        a.velocidad = 45000;
        a.setVelocidad(25);
        
        //comportamiento
        a.acelerar();
        b.acelerar();
        
        a.acelerar(80000);
        b.acelerar(40000);
        
        a.acelerar(80000, true);
        b.acelerar(15, false);
        
        a.frenar(45000);

        //muestro el estado de ambos vehiculos
        System.out.println(a);
        System.out.println("---------------------");
        System.out.println(b);
    }
}
