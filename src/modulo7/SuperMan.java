
package modulo7;

/**
 *
 * @author Roberto Olveras
 */
public class SuperMan extends SuperHeroe{

    @Override
    public void ataque() {
        System.out.println("super golpe");
        Marciano.totalMarcianosEnCombate--;
    }
 
}
