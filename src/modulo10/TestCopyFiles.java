
package modulo10;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roberto Olveras
 */
public class TestCopyFiles {
    public static void main(String[] args) {
        FileReader input = null;
        FileWriter output = null;
        try {
            String archivoOrigen = "C:\\Users\\jr_ro\\Desktop\\JavaSE6TESE\\src\\modulo10\\TestProperties.class";
            String archivoDestino = "C:\\Users\\jr_ro\\Desktop\\modulo10\\TestProperties.class";
            input = new FileReader(archivoOrigen);
            BufferedWriter bw = new BufferedWriter(output);
            
            output = new FileWriter(archivoDestino);
            char[] buffer = new char[256];
            int chartRead = input.read(buffer);
            while(chartRead != -1){
                output.write(buffer);
                chartRead = input.read(buffer);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                output.close();
                input.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
