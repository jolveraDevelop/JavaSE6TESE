
package modulo9.test;

import java.util.HashSet;
import java.util.Set;
import modulo6.MyDate;

/**
 *
 * @author Roberto Olveras
 */
public class TestHashSetMyDate {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new MyDate(9, 4, 2016));
        set.add(new MyDate(9, 4, 2016));
        set.add(new MyDate(9, 4, 2016));
        set.add(new MyDate(9, 4, 2016));
        System.out.println(set);
        
    }
}
