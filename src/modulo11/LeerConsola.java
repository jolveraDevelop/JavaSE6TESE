
package modulo11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

/**
 *
 * @author Roberto Olveras
 */
public class LeerConsola {
    public static void main(String[] args) {
        InputStreamReader input = 
                new InputStreamReader(System.in,Charset.defaultCharset());
        BufferedReader bf = new BufferedReader(input);
        FileWriter output = null;
        PrintStream ps = null;
        String buff = null;
        File log1 = new File("C:\\Users\\jr_ro\\Desktop\\consolaFileWriter.log");
        File log2 = new File("C:\\Users\\jr_ro\\Desktop\\consolaPrintStream.log");
        try {
            output = new FileWriter(log1, true);
            ps = new PrintStream(new FileOutputStream(log2, true));
            System.out.println("Escribe algo ...");
            
            buff = bf.readLine();
            while(!buff.equals("salir")){
                output.write(buff+"\n");// salto de linea para dar formato
                ps.println(buff);
                buff = bf.readLine();
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            try {
                output.close();
                ps.close();
                bf.close();
                input.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        
    }
}
