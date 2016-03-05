
package modulo5.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestCopyArrays {
    public static void main(String[] args) {
        int x [] = {1,2,3,4,5,6,7,8,9};
        int y [] = new int[3];
        System.arraycopy(x,4,y,0,3);
        for (int i : y) {
            System.out.println("y: "+i);
        }
        y[0]=99;
        System.out.println("x[0]: "+x[0]);
        System.out.println("y[0]: "+y[0]);
    }
}
