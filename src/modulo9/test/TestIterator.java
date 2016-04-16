
package modulo9.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Roberto Olveras
 */
public class TestIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(9);
        list.add(11);
        list.add(8);
        
        Integer result = 0;
        
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            result += iterator.next();
        }
        
        for (Integer i : list) {
            result += i;
        }
        
        System.out.println("Suma: "+result);
    }
}
