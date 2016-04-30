
package moduloExtra1;

/**
 *
 * @author Roberto Olveras
 */
public class TesString {
    public static void main(String[] args) {
        StringBuilder hola = new StringBuilder("Buenos dias");
        String saludo = "Buenos dias";
        String cortesia = "Buenos dias";
        String saludoCompleto = saludo + " ¿Como estan?";
        String pregunta1 = " ¿Como estan?";
        System.out.println(saludoCompleto);
        System.out.println(saludo.concat(pregunta1));
        System.out.println(saludo);
        System.out.println("------------");
        System.out.println(hola.append(pregunta1));
        System.out.println(hola);
        
    }
}
