
package modulo9.test;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Roberto Olveras
 */
public class TestHashSetString {
    
    public static void main(String[] args) {
        Set set = new HashSet();
        System.out.println(set);
        set.add("hola");
        System.out.println(set);
        set.add("Hola");
        System.out.println(set);
        set.add("hola");
        System.out.println(set);
        set.add("dsdsad");
        System.out.println(set);
        
    }

}
