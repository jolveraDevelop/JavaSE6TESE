
package modulo6.granja.test;

import modulo6.granja.Animal;
import modulo6.granja.Gato;
import modulo6.granja.Perro;

/**
 *
 * @author Roberto Olveras
 */
public class TestPolimorfismo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.comer();
        a = new Perro();
        a.comer();
        a = new Gato();
        a.comer();
    }
}
