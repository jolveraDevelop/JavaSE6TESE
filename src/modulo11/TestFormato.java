
package modulo11;

/**
 *
 * @author Roberto Olveras
 */
public class TestFormato {
    public static void main(String[] args) {
        System.out.printf("%s %d %x %g %n", "Hola", 13, 13, 3.141519245);
        System.out.printf("%7.3f%n",3.141519245);        
        System.out.printf("%1.6f%n",13.141);        
        //System.out.printf("%0.6f%n",13.141);   // lanza una exception
        
        System.out.println("fin");
    }
}
