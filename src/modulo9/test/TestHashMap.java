
package modulo9.test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Roberto Olveras
 */
public class TestHashMap {
    public static void main(String[] args) {
        //Map map = new HashMap();
        Map map = new LinkedHashMap();
        map.put(1,"uno");
        map.put(2,"dos");     
        map.put(5,"cinco");
        map.put(null,"null");
        map.put(null,"null2");
        map.put(6,"seis");
        map.put(6,"seis2");
        map.put(3,"tres");
        map.put(4,"cuatro");
        System.out.println(map);
        System.out.println("map.remove(4): "+map.remove(4));
        System.out.println("map.remove(4): "+map.remove(4));
        System.out.println(map);
        System.out.println("map.get(4): "+map.get(4));
        System.out.println("map.entrySet(): "+map.entrySet());
        System.out.println("map.keySet(): "+map.keySet());
        System.out.println("map.values(): "+map.values());
    }
}
