
package modulo10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import modulo6.MyDate;

/**
 *
 * @author Roberto Olveras
 */
public class TestDeserializacion {
    public static void main(String[] args) {
        MyDate hoyDeserializador = null;
        MyDate hoy = new MyDate();
        ObjectInput input;
        try {
            input = new ObjectInputStream(
                    new FileInputStream("C:\\Users\\jr_ro\\Desktop\\myDate.ser"));
            hoyDeserializador = (MyDate)input.readObject();
            System.out.println(hoy);
            System.out.println(hoyDeserializador);
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
