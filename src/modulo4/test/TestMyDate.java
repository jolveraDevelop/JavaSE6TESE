
package modulo4.test;

import modulo4.ejercicio.MyDate;

/**
 *
 * @author Roberto Olveras
 */
public class TestMyDate {
    public static void main(String[] args) {
        MyDate hoy = new MyDate(27,2,2016);
        MyDate finCurso = new MyDate(15,4,2016);
        
        System.out.println(hoy.getDaysMonth());
        System.out.println(finCurso.getDaysMonth());
    }
}
