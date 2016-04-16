
package modulo9.test;

import java.util.Set;
import java.util.TreeSet;
import modulo6.MyDate;
import modulo9.OrdenMyDatePorMes;

/**
 *
 * @author Roberto Olveras
 */
public class TestTreeSetMyDate {
    public static void main(String[] args) {
        //Set set = new TreeSet(); // orden es natual
        Set set = new TreeSet(new OrdenMyDatePorMes()); // orden especifica
        set.add(new MyDate(9, 6, 2016));
        set.add(new MyDate(2, 4, 2016));
        set.add(new MyDate(18, 7, 2016));
        set.add(new MyDate(15, 1, 2016));
        set.add(new MyDate(2, 11, 2016));
        System.out.println(set);
    }
}
