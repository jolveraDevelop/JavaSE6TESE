
package modulo6.granja.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestAtributosHeredados {
     public static void main(String[] args) {
        Padre p = new Hijo();
        System.out.println(p.x);;
    }
}
class Padre { int x = 9;}
class Hijo extends Padre{ int x = 5;}