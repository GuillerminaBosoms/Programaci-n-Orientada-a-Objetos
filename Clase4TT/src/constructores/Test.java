

package constructores;


public class Test {
    public static void main(String[] args) {
        //creo 2 autos
        Auto a = new Auto();
        Auto b = new Auto("Chevy", 0);
        
        a.marca = "Ford";
        a.velocidad = 0;
        
        //comportamiento
        a.acelerar();//0->10
        b.acelerar();//0->10
        
        a.acelerar(25);//10->35
        b.acelerar(40);//10->50
        
        a.acelerar(15, true);//35->65
        b.acelerar(15, false);//50->65

        //muestro el estado de ambos vehiculos
        System.out.println(a);
        System.out.println("---------------------");
        System.out.println(b);
    }
}
