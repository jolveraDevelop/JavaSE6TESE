
package modulo5.test;

import java.awt.Point;

/**
 *
 * @author Roberto Olveras
 */
public class TestDeclaringArray {
    public static void main(String[] args) {
        char s[] = new char[4];
        s[0] = 'h';
        s[1] = 'o';
        s[2] = 'l';
        s[3] = 'a';
        System.out.println(""+s[0]+s[1]+s[2]+s[3]);
        
        Point p[] = new Point[2];
        p[0] = new Point(1,1);
        p[1] = new Point(3,2);
        
        char s1[] = {'h','o','l','a'};
        Point p1[] = {new Point(1,1),new Point(3,2)};
    }
}
