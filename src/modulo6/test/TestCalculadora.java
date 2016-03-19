
package modulo6.test;

import modulo6.Calculadora;

/**
 *
 * @author Roberto Olveras
 */
public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sumar(1,3,5));
        System.out.println(calculadora.sumar(1,3,5,7,2));
        System.out.println(calculadora.sumar(13));
        System.out.println(calculadora.sumar());
        System.out.println(calculadora.sumar(9,4));
    }
}
