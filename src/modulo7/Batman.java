
package modulo7;

/**
 *
 * @author Roberto Olveras
 */
public class Batman extends SuperHeroe{

    @Override
    public void ataque() {
        System.out.println("batipistola ");
        Marciano.totalMarcianosEnCombate--;
    }

}
