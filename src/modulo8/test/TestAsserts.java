
package modulo8.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestAsserts {
    public static void main(String[] args) {
        Object miObjeto = getObjeto();
        assert miObjeto != null : "Mi afirmacion fue false el objeto es null";
        System.out.println("miObjeto: "+miObjeto);
        System.out.println("fin programa");
    }
    
    public static Object getObjeto(){
        if(2==1){
            return new Object();
        }else{
            return null;
        }
    }
            
}
