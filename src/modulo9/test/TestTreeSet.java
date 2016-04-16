
package modulo9.test;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Roberto Olveras
 */
public class TestTreeSet {
    public static void main(String[] args) {
        NavigableSet set = new TreeSet();
       // System.out.println(set);
       // set.add(5);
      //  System.out.println(set);
        set.add(8);
       // System.out.println(set);
        set.add(1);
       // System.out.println(set);
       // set.add(6);
      //  System.out.println(set);
        set.add(4);
      //  System.out.println(set);
        set.add(7);
     //   System.out.println(set);
        set.add(12);
        SortedSet subset = set.subSet(4 ,true, 9,true);
        
        subset.add(5);
        set.add(6);
        
        subset.add(9);
        System.out.println("set: "+set);
        System.out.println("subset: "+subset);
    }
}
