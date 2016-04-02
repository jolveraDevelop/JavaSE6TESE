
package modulo3.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestPrimitivos {
    public static void main(String[] args) {
        boolean verdad = true;
       // boolean verdad2 = 1;
        boolean mentira = false;
        //boolean mentira2 = 0;
        char c1 = 'f';
        //char c8 = "x";
        //char c2 = 'ab';
        //char c3 = '/t';
        char c4 = '\t';
        //char c5 = '/u03a9';
        char c6 = '\u03a9';
        char c7 = 64;      
        //System.out.println(""+c1+" - "+c4+" - "+c6+" - "+c7+" - ");
        String s1 = "Hola Mundo";
        String s2 = new String(s1);
        String s3 = s1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        byte b = 127;
        //byte b2 = 128;
        short sh1 = 128;
        //byte b4 = sh1;
        System.out.println(sh1);
        short sh2 = 32767;
        int in1= 32767;
        int in2 = 2147483647;
        long l2 = 2147483648L;
        long l_1 = 9223372036854775807L;
        
        float f = 3.1416F;
        double d = 3.1416D;
        double exp = 3.141e8;
        
    }
}
