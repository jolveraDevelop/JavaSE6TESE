
package modulo6.test;
import modulo6.MyDate;
/**
 *
 * @author Roberto Olveras
 */
public class TestMyDateEquals {
    public static void main(String[] args) {
        MyDate hoy = new MyDate(19,3,2016);
        MyDate otroHoy = new MyDate(19,3,2016);
        MyDate mañana = new MyDate(20,3,2016);
        MyDate otroMañana = mañana;
        
        System.out.println("hoy == otroHoy: "+(hoy == otroHoy));
        System.out.println("mañana == otroMañana: "+(mañana == otroMañana));
        System.out.println("hoy.equals(otroHoy): "+hoy.equals(otroHoy));
        System.out.println("mañana.equals(otroMañana): "+mañana.equals(otroMañana));
        System.out.println("hoy.equals(otroMañana): "+hoy.equals(mañana));
        
        System.out.println(hoy);
        System.out.println(hoy.toString());
    }
}
