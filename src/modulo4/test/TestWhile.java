
package modulo4.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestWhile {
    public static void main(String[] args) {
        int i = 0;
        while(i<10){
            System.out.println("i: "+i++);;
        }
        
        int j = 0;
        do{
            System.out.println("j: "+j++);;
        }while(j<10);
            
    }
}
