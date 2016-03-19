
package modulo6.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestConstaintPool {
    public static void main(String[] args) {
        String[] saludos = new String[1000];
        for (int i = 0; i < saludos.length; i++) {
            saludos[i] = "hola";
        }    
        for (int i = 0; i < saludos.length; i++) {
            saludos[i] = new String("hola");
        }
        System.out.println("hola");
    }
}
