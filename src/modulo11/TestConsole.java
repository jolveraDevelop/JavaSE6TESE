
package modulo11;

import java.io.Console;

/**
 *
 * @author Roberto Olveras
 */
public class TestConsole {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Hola, escribe tu usuario: ");
        String user = console.readLine();
        System.out.println("escribe tu pass: ");
        char[] pass = console.readPassword();
        
        System.out.println(user + " - "+pass);
        for (char pas : pass) {
            System.out.print(pas);
        }
    }
}
