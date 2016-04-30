
package moduloExtra1;

import java.util.Locale;

/**
 *
 * @author Roberto Olveras
 */
public class TestLocale {
    public static void main(String[] args) {
        Locale esMx = new Locale("es","MX");
        Locale esUS = new Locale("es","US");
        String[] isoCountries = Locale.getISOCountries();
        System.out.println("paises:");
        for (String oCountry : isoCountries) {
            System.out.println(oCountry);
        }
        System.out.println("idiomas:");
        String[] isoLanguages = Locale.getISOLanguages();
        for (String oLanguage : isoLanguages) {
            System.out.println(oLanguage);
        }
    }
}
