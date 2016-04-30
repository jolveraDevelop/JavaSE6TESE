package control;

/**
 *
 * @author Hiroshige
 */
public class ExamThread extends Thread{

    
    public void run(){
        Thread t = new SimulatorThread();
        t.start();
        System.out.println("It´s alive t´s Thread ? " + t.isAlive());        
        try{
            t.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("It´s alive t´s Thread ? " + t.isAlive());
        System.out.println("Do exam certification");
    }
}
