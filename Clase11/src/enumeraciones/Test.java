package enumeraciones;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingresa en que dia estas: ");
        String diaHoy = lector.next();
        
        if (diaHoy.toLowerCase().equals(String.valueOf(Dia.LUNES).toLowerCase())) 
        {
            System.out.println("Hoy es Lunes!...ANIMO!");
        } 
        else 
        {
            if (diaHoy.toLowerCase().equals(String.valueOf(Dia.VIERNES).toLowerCase())) 
            {
                System.out.println("Hoy es Viernes!...Iuuupyy!");
            } 
            else 
            {
                System.out.println("Es un dia cualquiera");
            }
        }  
    }
}