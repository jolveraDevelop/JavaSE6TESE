
package modulo9.test;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Roberto Olveras
 */
public class TestLinkedHasSet {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        System.out.println(set);
        set.add("hola");
        System.out.println(set);
        set.add("Hola");
        System.out.println(set);
        set.add("hola");
        System.out.println(set);
        set.add("dsdsad");
        System.out.println(set);
        set.add("otro");
        System.out.println(set);
        set.add("el que sigue");
        System.out.println(set);
        set.add("el ultimo");
        System.out.println(set);
    }
}
