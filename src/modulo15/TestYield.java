
package modulo15;

/**
 *
 * @author Roberto Olveras
 */
public class TestYield {
    public static void main(String[] args) {
        Thread.yield();
        
        Thread t = new Thread(new HijoJoin());
        t.start();
        Thread tMain = Thread.currentThread();
        System.out.println(tMain.getName()+" "+tMain.getPriority());
        System.out.println(t.getName()+" "+t.getPriority());   
        for (int i = 0; i < 1000; i++) {
           System.out.println("Main:i: "+i);
        }
    }
}

class HiloYield implements Runnable{
     @Override
    public void run() {
        System.out.println("HiloYield de hilo :HijoJoin");
        for (int i = 0; i < 1000; i++) {
            System.out.println("HiloYield:i: "+i);
        }
        System.out.println("Fin de hilo :HiloYield");
    }
}
