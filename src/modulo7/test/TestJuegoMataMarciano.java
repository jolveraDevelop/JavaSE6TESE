
package modulo7.test;

import modulo7.Batman;
import modulo7.Marciano;
import modulo7.SuperHeroe;
import modulo7.SuperMan;

/**
 *
 * @author Roberto Olveras
 */
public class TestJuegoMataMarciano {
    public static void main(String[] args) {
        Marciano m = new Marciano();
        Marciano m1 = new Marciano();
        Marciano m2 = new Marciano();
        Marciano m3 = new Marciano();
        Marciano m4 = new Marciano();
//        System.out.println(m4.totalMarcianosEnCombate);
//        System.out.println(m2.totalMarcianosEnCombate);
//        System.out.println(m.totalMarcianosEnCombate);
        SuperHeroe batman = new Batman();
        SuperHeroe superMan = new SuperMan();
        System.out.println("Score Marcianos: "+
                        Marciano.totalMarcianosEnCombate);
        batman.ataque();
        System.out.println("Score Marcianos: "+
                        Marciano.totalMarcianosEnCombate);
        superMan.ataque();
        new Marciano();
        System.out.println("Score Marcianos: "+
                        Marciano.totalMarcianosEnCombate);
        
        
    }
}
