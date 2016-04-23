
package modulo11;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Roberto Olveras
 */
public class LeerConsolaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\\s");
        PrintStream output = null;
        String buff = null;
        try {
            output = new PrintStream("C:\\Users\\jr_ro\\Desktop\\consola.log");
            System.out.println("Escribe algo ...");
            
            buff = input.next();
            while(!buff.equals("salir")){
                System.out.println("buff: "+buff);
                output.println(buff);
                buff = input.next();
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            output.close();
            input.close();
        }
        
    }
}
