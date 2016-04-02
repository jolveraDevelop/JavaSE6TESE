
package modulo6.granja;

/**
 *
 * @author Roberto Olveras
 */
public abstract class Mamifero extends Animal{
    
    public abstract void otroMetodo();

    public Mamifero() {
    }

    @Override
    public void formaNacer(){
        System.out.println("nací del vientre de mi mamá");
    }
    
}
