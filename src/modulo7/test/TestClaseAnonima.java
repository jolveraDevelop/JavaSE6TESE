package modulo7.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestClaseAnonima {

    public static void main(String[] args) {
        Anonima n1 = new Anonima() {
            public void met1() {
                System.out.println("Hola en anonima 1");
            }
        };
        Anonima n2 = new AnonimaImplement();      
        n1.met1();
        n2.met1();
        G g = new G();
        G gAnon = 
          new G(){ public void met(){System.out.println("En Anonima");otro();}
                    public void otro(){}
          };
        //gAnon.otro();
        g.met();
        gAnon.met();
    }
}

class G{ public void met(){System.out.println("En normal");}}

interface Anonima {

    void met1();
}

class AnonimaImplement implements Anonima {
    @Override
    public void met1() {
        System.out.println("Hola en implementacion de AnonimaImplement");
    }
}
