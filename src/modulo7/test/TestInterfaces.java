
package modulo7.test;

import modulo6.granja.Animal;
import modulo6.granja.Bird;
import modulo6.granja.Perro;
import modulo7.Batman;
import modulo7.SuperHeroe;
import modulo7.SuperMan;
import modulo7.interfaces.Flyer;

/**
 *
 * @author Roberto Olveras
 */
public class TestInterfaces {
    public static void main(String[] args) {
        Flyer[] voladores = new Flyer[2];
        Animal[] animales = new Animal[2];
        SuperHeroe[] superHeores = new SuperHeroe[2];
        
        voladores[0] = new SuperMan();
        voladores[1] = new Bird();
        
        animales[0] = new Bird();
        animales[0] = new Perro();
        
        superHeores[0] = new SuperMan();
        superHeores[1] = new Batman();
        
    }
}

interface W { void mW(); void mW2();};
interface X extends W, Y{void mX();};
interface Y {void mY();};
interface Z {void mZ();};

abstract class L{};
abstract class M implements X{ public abstract void mW();};

class N extends M implements X, Z{
    @Override
    public void mW() {
    }

    @Override
    public void mX() {
    }

    @Override
    public void mW2() {
    }

    @Override
    public void mY() {
    }

    @Override
    public void mZ() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
