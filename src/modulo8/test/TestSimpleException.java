package modulo8.test;

/**
 *
 * @author Roberto Olveras
 */
public class TestSimpleException {

    public static void main(String[] args) {

        String[] valores = {"9", "dos", "4"};
        int result = 0;
        for (String valor : valores) {
            try {
                result += Integer.parseInt(valor);
            } catch (NumberFormatException ex) {
                System.out.println("Ocurrio un error: " + ex.getMessage()
                        +"pero se continua con los demas valores");
                //continue;
            }
        }
        System.out.println("El resultado es: " + result);

        System.out.println("El programa termino correcto");
    }
}
