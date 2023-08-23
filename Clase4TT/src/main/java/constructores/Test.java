package constructores;

public class Test {
    public static void main(String[] args) {
        //Creo 2 autos
        Auto a = new Auto();
        Auto b = new Auto("Chevy", 0);
        
        //inicializar auto a
        a.marca = "Ford";
        a.velocidad = 0;
        //Muestro el estado de ambos vehiculos
        System.out.println(a);
        System.out.println("-----------------------------");
        System.out.println(b);
    }
}