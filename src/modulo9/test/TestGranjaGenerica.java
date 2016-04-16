
package modulo9.test;

import modulo6.granja.Animal;
import modulo6.granja.Gato;
import modulo6.granja.Mamifero;
import modulo6.granja.Perro;

/**
 *
 * @author Roberto Olveras
 */
public class TestGranjaGenerica {
    public static void main(String[] args) {
        Animal<String> a = new Gato<String>(); 
        a.setName("firulais");
        Animal<Integer> a2 = new Gato<Integer>();
        a2.setName(1187);
        Animal<? super Mamifero> a3 = new Gato<>();
        a3.setName(new Animal());
    }
}
