
package modulo15;

/**
 *
 * @author Roberto Olveras
 */
public class TestSync {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder cadena = new StringBuilder("hola");
        Thread t1 = new Thread(new HiloSycn(cadena));
        Thread t2 = new Thread(new HiloSycn(cadena));
        t1.start();
        t2.start();
        Thread.sleep(4000);
        System.out.println(cadena);
    }
}

class HiloSycn implements Runnable{
    
    StringBuilder cadena = null;

    public HiloSycn(StringBuilder cadena) {
        this.cadena = cadena;
    }

    @Override
    public void run() {
        synchronized (this.cadena){
            appendValue();
        }
    }
    
    public void appendValue(){
        for (int i = 0; i < 100; i++) {
           cadena.append(i+",");
        }
    }
    
}
