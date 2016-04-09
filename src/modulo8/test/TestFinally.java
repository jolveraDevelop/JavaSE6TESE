
package modulo8.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestFinally {
    public static void main(String[] args) {
        
        System.out.println("resultado: "+result());
        
        try{
            System.out.println("inicio del try");
            int x = 3/0;
            System.out.println("fin try");
        }catch(IllegalArgumentException e){
            System.out.println("dentro del catch");
        }finally{
            System.out.println("dentro del finally");
        }
    }
    
    public static int result(){
        try{
            // operaciones
            return 5;
        }catch(Exception e){
            
        }
        return 3;
    }
}
