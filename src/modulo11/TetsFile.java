
package modulo11;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roberto Olveras
 */
public class TetsFile {
    public static void main(String[] args) {
        try {
            File myDir = new File("C:\\Users\\jr_ro\\Desktop");
            File myFile = new File(myDir,"hola.txt");
            myFile.createNewFile();
            
            File pdf = new File("C:\\Users\\jr_ro\\Downloads\\OCPJPSE6\\Recursos para la Clase\\Instructor\\Modulo 11\\Modulo 11.pdf");
            
            System.out.println("pdf.canRead(): "+pdf.canRead());
            System.out.println("pdf.exists(): "+pdf.exists());
            System.out.println("pdf.isDirectory(): "+pdf.isDirectory());
            System.out.println("pdf.isFile(): "+pdf.isFile());
            System.out.println("pdf.isHidden(): "+pdf.isHidden());
            System.out.println("pdf.getName(): "+pdf.getName());
            System.out.println("pdf.getParent(): "+pdf.getParent());
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
