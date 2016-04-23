
package modulo15;

import java.util.Date;

/**
 *
 * @author Roberto Olveras
 */
public class TestSleep {
    public static void main(String[] args) {
        long currenTime = System.currentTimeMillis();
        Thread t1 = new Thread(new Counter());
        Thread t2 = new Thread(new CounterSleep());
        TerminarHilo tH = new TerminarHilo();
        Thread t3 = new Thread(tH);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        long difDate = System.currentTimeMillis() - currenTime;
        while(difDate < 5000){
            System.out.println("difDate: "+difDate);
            difDate = System.currentTimeMillis() - currenTime;
        }                  
        tH.stopHilo();
    }
}
class Counter implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Counter: "+i);
        }
    }   
}

class CounterSleep implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if(i==500){
                try{Thread.sleep(5000);}catch(Exception e){e.printStackTrace();}
            }
            System.out.println("CounterSleep: "+i);
        }
    }   
}

class TerminarHilo implements Runnable{
    private boolean timeOut = false;

    @Override
    public void run() {
       while(!timeOut){
           System.out.println("ejecutando... ");
       }
    }
    
    public void stopHilo(){
        timeOut = true;
    }
}
