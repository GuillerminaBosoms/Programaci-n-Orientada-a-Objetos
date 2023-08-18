package sobrecarga;
public class Test {
    public static void main(String[] args) {
        //Creo un auto
        Auto a = new Auto();
        
        //le doy un estado inicial
        a.marca = "Ford";
        a.velocidad = 0;
        
        //comportamientos
        a.acelerar();//0->10
        a.acelerar(25);//10->35
        a.acelerar(10, false);//35->45
        
        //Muestro el estado final
        System.out.println(a);
    }
}
