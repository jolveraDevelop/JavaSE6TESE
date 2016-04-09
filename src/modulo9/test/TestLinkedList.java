
package modulo9.test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Roberto Olveras
 */
public class TestLinkedList {
 public static void main(String[] args) {
        List lista = new LinkedList();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Collections");
        System.out.println(lista);
        lista.add(1, "Intermedio");
         System.out.println(lista);
        System.out.println("lista.get(2): "+lista.get(2));
        System.out.println("lista.contains(\"Mundo\"): "+
                lista.contains("Mundo"));
        System.out.println("lista.contains(\"fdasfasd\"): "+
                lista.contains("fdasfasd"));
        lista.remove("Collections");
        System.out.println(lista);
        System.out.println("lista.size(): "+lista.size());
        
        System.out.println("--------Deque------------");
        Deque listaAsPila = (Deque)lista ;
        System.out.println(listaAsPila);
        listaAsPila.push("pila");
        System.out.println(listaAsPila);
        System.out.println("listaAsPila.peek(): "+listaAsPila.peek());
        System.out.println("listaAsPila.poll():"+listaAsPila.poll());
        System.out.println("listaAsPila.peek():"+listaAsPila.peek());
         System.out.println(listaAsPila);
        listaAsPila.push(args);
        
    }
}
