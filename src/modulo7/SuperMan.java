
package modulo7;

import modulo7.interfaces.Flyer;

/**
 *
 * @author Roberto Olveras
 */
public class SuperMan extends SuperHeroe implements Flyer{

    @Override
    public void ataque() {
        System.out.println("super golpe");
        Marciano.totalMarcianosEnCombate--;
    }

    @Override
    public void takeOff() {
    }

    @Override
    public void land() {
    }

    @Override
    public void fly() {
    }
 
}
