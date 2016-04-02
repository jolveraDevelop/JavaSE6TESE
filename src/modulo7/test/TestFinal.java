
package modulo7.test;
import java.lang.Math;
/**
 *
 * @author Roberto Olveras
 */
public class TestFinal {
    public static void main(String[] args) {
        A a = new A(2);
        A a2 = new A(0);
        A a3 = new A(6);
        a.m1();
        // no se puede cambiar el valor a una constante
        //a.x = 10;
        //a.x = 5;
//        Math m = new Math();
//        m.abs(2);
        Math.abs(3);
    }
}

//final
class A {
    public final void m1(){}
    public void m2(){}
    //public final int x = 7;
    public  final int x;
//    static{
//        x = 0;
//    }

    public A() {
        this.x = 0;
    }

    
    public A(int x) {
        this.x = x;
    }
    
}

class B extends A{ // Herencia no permitida cuando A es final
    //@Override public void m1(){} // no se puede sobreescribir un método final
    @Override public void m2(){}
    public static final int y = 7;
}