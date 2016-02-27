
package modulo4.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestFor {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i: "+i);
//        }
//        
//        int j = 0;
//        for ( ; ; ) {
//            System.out.println("j: "+j++);
//            if(j>=10)break;
//        }
        
        int m = 0;
        for (System.out.println("Estoy iniciando el for")
              ; true ;System.out.println("Termine iteracion")) {
            System.out.println("m: "+m++);
            if(m>=10)break;
        }
        
    }
}
