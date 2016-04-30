
package moduloExtra1;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Roberto Olveras
 */
public class TestNumberFormat {
    public static void main(String[] args) {
        NumberFormat nf = 
                NumberFormat.getNumberInstance(new Locale("es","MX"));
        
        nf.setMaximumFractionDigits(2);
        
        System.out.println(nf.format(534.265445));
    }
}
