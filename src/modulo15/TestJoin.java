
package modulo15;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roberto Olveras
 */
public class TestJoin {
    public static void main(String[] args) {
        Thread t = new Thread(new HijoJoin());
        t.start();
        try {
            t.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < 1000; i++) {
           System.out.println("Main:i: "+i);
        }
    }
}

class HijoJoin implements Runnable{

    @Override
    public void run() {
        System.out.println("Inicio de hilo :HijoJoin");
        for (int i = 0; i < 1000; i++) {
            System.out.println("HijoJoin:i: "+i);
        }
        System.out.println("Fin de hilo :HijoJoin");
    }
    
}