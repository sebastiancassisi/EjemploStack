package ar.com.cassisi.ejemplostack;

import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String args[]) {
        // Creo la pila 
        Stack st = new Stack();

        Persona persona1 = new Persona("Sebastian", 31297689, 220483);
        Persona persona2 = new Persona("Juan", 654654, 2205673);
        Persona persona3 = new Persona("Santiago", 78478768, 898776);
        Persona persona4 = new Persona("Gonzalo", 535337, 3144684);
        Persona persona5 = new Persona("Pedro", 76363, 13455);
        
        Persona persona6 = new Persona("Carlos", 23416666, 245737367);


        //Agrego objetos a la pila.
        st.push(persona1);
        st.push(persona2);
        st.push(persona3);
        st.push(persona4);
        st.push(persona5);

        //Muestro los elementos
        System.out.println("Elementos:\n " + st);

        // pop() Remueve el que esta al tope de la pila.
        System.out.println("Fue removido el objeto: " + st.pop());
        System.out.println("Elementos:\n " + st);

        //Pregunto si esta vacio
        System.out.println("Esta vacio: " + st.isEmpty());
        
        //Traigo el objeto que esta al tope de la pila 
        System.out.println("Me muestra quien esta al tope de la pila: " + st.peek());
        
        //Buscar un objeto dentro de la pila
        System.out.println("Posicion del objeto persona1: " + st.search(persona1));
        
        //Tamaño de la cola
        System.out.println("Tamaño de la cola: " + st.size());
        
        //Agrego un bojeto en la cola en la posicion 3
        st.add(3, persona6);
         System.out.println("Elementos:\n " + st);
         
         //Traigo un elemento de una posicion
         System.out.println("Elemento en la posicion 2= "+st.get(2));
    }
}
