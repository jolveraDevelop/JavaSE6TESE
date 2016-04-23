
package modulo10;

import java.util.Properties;

/**
 *
 * @author Roberto Olveras
 */
public class TestProperties {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}
