package colecciones.listas;

import java.util.ArrayList;
import java.util.Iterator;

public class Listas {
    public static void main(String[] args) {
        //creo una coleccion de tipo de lista
        ArrayList coleccion = new ArrayList();//Coleccion no tipada(heterogeneas)
        //Coleccion NO tipada puede guardar objetos de cualquier CLASE
        
        //Coleccion TIPADA
        ArrayList<Persona> coleccion2 = new ArrayList<>();//Coleccion no tipada
        //Tres manera de recorrer la coleccion con for, forech y coleccion
        
        //Coleccion TIPADA(Colecciones homogeneas): 
        //Guarda objetos de una unica clase.
        
        //crear objetos de la clase persona
        Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona("Wanda", 22);
        Persona p3 = new Persona("Fernando", 55);
        Persona p4 = new Persona("Juan", 67);
        
        //agrego los objetos a la coleccion
        coleccion2.add(p1);
        coleccion2.add(p2);
        coleccion2.add(p3);
        coleccion2.add(p4);
        
        System.out.println("Contenido: " + coleccion2);
        
        //Agrego un objeto mas en la 3ra posicion de la coleccion
        Persona p5 = new Persona("Ana",50);
        coleccion2.add(2, p5);
        
        //Elimino un objeto de la coleccion
        coleccion2.remove(3);
        
        System.out.println("Nuevo contenido: " + coleccion2);
        
        System.out.println("------------------------------");
        
        System.out.println("Recorro con for");//forl genera el for
        
        for (int i = 0; i < coleccion2.size() ; i++) {
            Persona unaPersona = coleccion2.get(i);
            
            if (unaPersona.getEdad()>28) {
                System.out.println(unaPersona);
            }
        }
        
        //RECORRO CON FOREACH fore
        System.out.println("RECORRO CON FOREACH fore");
        for (Persona unaPersona : coleccion2) {
            if (unaPersona.getEdad() <= 25) {
                System.out.println(unaPersona);
            } 
        }
        
        //FORMA PROFESIONAL - PATRONES DE DISEÑO
        //Crear un iterador para recorrer
        System.out.println("Recorro con iterator"); //whileit
        Iterator it= coleccion2.iterator();
        
        while (it.hasNext()) {
            Persona unaPersona = (Persona)it.next();
            if (unaPersona.getEdad() >= 20 && unaPersona.getEdad() <= 30) {
                System.out.println(unaPersona);
            }
        }
        
    }
}