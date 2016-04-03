
package modulo8.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestApilamientoExceptions {
    public static void main(String[] args) {
        System.out.println("Inicio programa");
        try{
           doStuff();
        }catch(ArithmeticException ex){
            System.out.println("Error capturado en main()");
        }
        System.out.println("Fin programa");
    }
    
    public static void doStuff(){
        try{
           doMoreStuff();
        }catch(ArithmeticException ex){
            System.out.println("Error capturado en doStuff()");
        }
    }
    
    public static void doMoreStuff(){
        try{
            int x = 5/0;
        }catch(NumberFormatException ex){
            System.out.println("Error capturado en doMoreStuff()");
        }
        
    }
}
