
package modulo6.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestWrappers {
    public static void main(String[] args) {
        int x = 430;
        Integer x2 = 430;
        Integer x3 = x;
        Integer x4 = new Integer(430);
        Integer x5 = new Integer(x2);
        Integer x6 = new Integer(x5);
        Integer x7 = new Integer("430");
        int x8 = x + x6;
        int x9 = x3.valueOf("98");
        int x10 = x3.parseInt("98");
        short s = x3.shortValue();
        Short s2 = x3.shortValue();
        Boolean b = new Boolean("true");
        Boolean b2 = new Boolean("FaLsE");
        System.out.println(b);
        System.out.println(b2);
    }
}
