
package modulo6.granja;

/**
 *
 * @author Roberto Olveras
 */
public abstract class Animal {
    public abstract void sonido();
    public abstract void comer();
    public abstract void formaNacer();
    
    
    public boolean estoyVivo(){
        // validar
        return true;
    }
            
}
