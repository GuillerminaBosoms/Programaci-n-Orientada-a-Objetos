package metodos;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //creo un objeto de la clase CajaDeAhorro
        //newo
        CajaDeAhorro cda = new CajaDeAhorro();
        CajaDeAhorro cda2 = new CajaDeAhorro();
        
        //ESTADO INICIAL - CONJUNTO DE VALORES QUE TOMAN SUS ATRIBUTOS
        //Le doy un estado al objeto
        cda.saldo = 2500;
        cda.moneda = "U$s";
        
        cda2.saldo = 700;
        cda2.moneda = "$";
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el monton a depositar: ");
        cda.depositar(lector.nextInt());
        
        System.out.println("Ingrese el monton a extraer: ");
        System.out.println(cda.extraer(lector.nextInt()));
        
        //Comportamiento
        cda.consultarSaldo();
        System.out.println("-----------------");
        cda2.consultarSaldo();
        
    }
            
}
