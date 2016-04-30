
package moduloExtra1;

import java.util.Scanner;

/**
 *
 * @author Roberto Olveras
 */
public class TestER {
    public static void main(String[] args) {
        String text = "hola           como estan";
        Scanner s = new Scanner(text);
        s.useDelimiter("\\w\\s+");
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }
}
