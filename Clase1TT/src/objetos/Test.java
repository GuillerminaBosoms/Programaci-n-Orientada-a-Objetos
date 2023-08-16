/*
 * 
 */
package objetos;

public class Test {
    public static void main(String[] args) {
        //1 - Creamos un objeto de la clase Auto
        //newo --> nuevo objeto
        // autocompletar = ctrl + espacio
        Auto a = new Auto();
        //Auto a <-- es una variable
        //constructor --> Auto()
        //todo esto es el objeto --> new Auto()
        
        //2 - definimos el estado inicial del objeto
        //metodos y atributos heredados --> equals
        a.marca = " Ford";
        a.color = " Gris";
        a.velocidad = 0;
        
        // 3 - comportamiento del objeto
        a.acelerar();//0 -> 10
        a.acelerar();//10->20
        a.acelerar();//20->30
        a.frenar();//30->25
        
        //tocar la tecla ins para poder escribir TRANQUILA
        
        // 4 - muestro el estado del objeto con toString()
        System.out.println(a.toString());
    }
}
