
package modulo7;

/**
 *
 * @author Roberto Olveras
 */
public class ClaseExterna {
    
    private  static int  x =0;
    
    public class ClaseInterna{
        public int x;
        public void metodo(){ x = 9;}
        public class ClaseMasInterna{}
    }
    
    public static class ClaseInternaEstatica{
        public void metodoEstatico(){
            x = 8;
        }
    }
    
    public void metodoX(){
        final int y = 0;
        if(1==1){
            class ClaseLocal{ ClaseLocal(){x=7; System.out.println(y);}}
        }
    }
}
