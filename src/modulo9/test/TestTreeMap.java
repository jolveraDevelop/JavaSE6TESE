
package modulo9.test;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Roberto Olveras
 */
public class TestTreeMap {
    public static void main(String[] args) {
        Map map = new TreeMap();
        map.put(1,"uno");
        map.put(2,"dos");     
        map.put(5,"cinco");
        //map.put(null,"null");
        //map.put(null,"null2");
        map.put(6,"seis");
        map.put(6,"seis2");
        map.put(3,"tres");
        map.put(4,"cuatro");
        System.out.println(map);
    }
}
