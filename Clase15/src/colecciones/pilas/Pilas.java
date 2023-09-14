package colecciones.pilas;

import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        //creo una coleccion de tipo Pila (LIFO) --> Stack
        Stack pila = new Stack();
        
        //Agrego objetos a una coleccion
        pila.push("Pablo");
        pila.push("Betina");
        pila.push("Nahuel");
        pila.push("Matias");
        pila.push("Nicolas");
        pila.push("Candelaria");
        pila.push("Fernando");
        pila.push("Jorge");
        pila.push("Felipe");
        pila.push("Guillermina");
        pila.push("");
        
        //Muestro el contenido
        //VER EL CONTENIDO DE LA COLA
        System.out.println("Contenido" + pila);
        System.out.println("Tamaño" + pila.size());
        System.out.println("1er objeto que deberia salir" + pila.peek());
        System.out.println("Saco un objeto" + pila.pop());
        System.out.println("Nuevo contenido" + pila);
        
        //SI ESTA VACIA
        System.out.println("Pila vacia: "+ pila.empty());
        // no es conveniente usar solo el remove
       // pila.removeAll();
        System.out.println("Nuevo contenido" + pila);
    }
}
