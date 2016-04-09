
package modulo9.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roberto Olveras
 */
public class TestArrayList {
    public static void main(String[] args) {
        List lista = new ArrayList();
        //List lista = new Vector();
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
        lista.clear();
        System.out.println(lista);
        
        
    }
}
