
package modulo6.granja;

/**
 *
 * @author Roberto Olveras
 */
public class Perro extends Mamifero{

    @Override
    public void sonido() {
    }

    @Override
    public void comer() {
        System.out.println("Soy un perro y como croquetas");
    }

    @Override
    public void otroMetodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
