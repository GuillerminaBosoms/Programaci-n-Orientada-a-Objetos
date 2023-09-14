package colecciones;

import java.util.LinkedList;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        //creo una coleccion de tipo cola(FIFO)-> queue
        Queue cola = new LinkedList();
        
        //Agrego objetos a una coleccion
        cola.add("Pablo");
        cola.add("Betina");
        cola.add("Nahuel");
        cola.add("Matias");
        cola.add("Nicolas");
        cola.add("Candelaria");
        cola.add("Fernando");
        cola.add("Jorge");
        cola.add("Felipe");
        cola.add("Guillermina");
        cola.add("");
        
        //Muestro el contenido
        //VER EL CONTENIDO DE LA COLA
        System.out.println("Contenido" + cola);
        System.out.println("Tamaño" + cola.size());
        System.out.println("1er objeto que deberia salir" + cola.peek());
        System.out.println("Saco un objeto" + cola.poll());
        System.out.println("Nuevo contenido" + cola);
        // no es conveniente usar solo el remove
        cola.removeAll(cola);
        System.out.println("Nuevo contenido" + cola);
    }
}
