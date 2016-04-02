
package modulo7.test;

import modulo7.ClaseExterna;

/**
 *
 * @author Roberto Olveras
 */
public class TestInternas {
    public static void main(String[] args) {
        ClaseExterna myClaseExterna = new ClaseExterna();
        ClaseExterna.ClaseInterna myObjectInterno = 
                    //myClaseExterna.new ClaseInterna();
                    new ClaseExterna().new ClaseInterna();
                    //new ClaseExterna.ClaseInterna();  // no valido para clases no estaticas  
        
        ClaseExterna.ClaseInternaEstatica myObjInternoEstatico = 
                     new ClaseExterna.ClaseInternaEstatica();
        //myObjectInterno.
    }
}
