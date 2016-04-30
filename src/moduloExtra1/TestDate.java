
package moduloExtra1;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roberto Olveras
 */
public class TestDate {
    public static void main(String[] args) {
        Date hoy = new Date();
        DateFormat df =
                DateFormat.getDateInstance(DateFormat.MEDIUM,
                        new Locale("es","MX"));
        
        System.out.println(hoy);
        System.out.println(df.format(hoy));
        try {
            Date mañana = df.parse("1/5/2016");
            System.out.println("mañana: "+mañana);
        } catch (ParseException ex) {
           ex.printStackTrace();
        }
    }
}
