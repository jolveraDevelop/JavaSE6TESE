package modulo6.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestInvocacionConstructores {

    public static void main(String[] args) {
        new BB(5);
    }
}

class AA extends Object{
    AA(String saludo) {
        super();
        System.out.println("AA(String saludo)"+ saludo);
    }
}

class BB extends AA {
    BB() {
        super("holaaa");
        System.out.println(" BB() ");
    }
    
    BB(String saludo) {
        this();
        System.out.println("BB(String saludo) ");
        //super(saludo);
    }
    
    BB(int x){
        this(String.valueOf(x));
        System.out.println("BB(int x)");
    }
    
}
