
package modulo10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import modulo6.MyDate;

/**
 *
 * @author Roberto Olveras
 */
public class TestSerializacion {
    public static void main(String[] args) {
        MyDate hoy = new MyDate(16, 4, 2016);
        ObjectOutput output;
        try {
            output = new ObjectOutputStream(
                    new FileOutputStream("C:\\Users\\jr_ro\\Desktop\\myDate.ser"));
            output.writeObject(hoy);
            output.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
