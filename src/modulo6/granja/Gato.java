
package modulo6.granja;

/**
 *
 * @author Roberto Olveras
 */
public class Gato extends Animal{

    public Gato() {
        super("");
    }
    
    

    @Override
    public void sonido() {
        System.out.println("Soy un gato miau");
    }
  
    @Override
    public void comer() {
        System.out.println("Soy un gato y como atún");
    }

    @Override
    public void formaNacer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
