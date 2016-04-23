
package modulo15;

import java.util.logging.Level;
import java.util.logging.Logger;
import modulo6.MyDate;

/**
 *
 * @author Roberto Olveras
 */
public class MyFirstThread {
    public static void main(String[] args) {
        Thread t1 = new MiHilo(); 
        Thread t2 = new Thread(new MiHiloRunnable());
        
        System.out.println("Inicio main");
        t1.setPriority(1);
        t2.setPriority(8);
        t1.start();
        t2.start();
        // esto se ejecuta en el mismo hilo del main
//        t1.run(); 
//        t1.run();
//        t2.run();
        System.out.println("fin main");
//        t1 = new MiHilo();
//        t1.start();
    }
}

class MiHilo extends Thread{
   
    @Override
    public void run() {
        System.out.println("Soy el hilo: MiHilo, inicio");
        //new MiHilo().start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Soy el hilo: MiHilo, fin");
    }
}

class MiHiloRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Soy el hilo: MiHiloRunnable, inicio");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Soy el hilo: MiHiloRunnable, fin");
    }
}