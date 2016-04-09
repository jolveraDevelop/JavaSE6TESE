
package modulo8.test;


/**
 *
 * @author Roberto Olveras
 */
public class TestDeclaracionExceptions {
    public static void main(String[] args) {
        System.out.println("inicio");
        Integer.parseInt("dos");
        try {
            pausa();
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }catch (InterruptedException ex) {
            ex.printStackTrace();
        }catch (Exception ex) {
            ex.printStackTrace();
        }catch (Throwable ex) {
            ex.printStackTrace();
        }
        System.out.println("final");
    }
    
    public static void pausa() throws InterruptedException{
        
        Thread.sleep(3000); // detener programa por 3 seg
       
        /// codigo
        Thread.sleep(3000);
        // mas codigo
        Thread.sleep(3000);
        
        // mas mas codigo
        Thread.sleep(3000);
        
        
        Thread.sleep(3000);
        
        
    }
    
    
}
