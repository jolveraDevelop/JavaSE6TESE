package control;

/**
 *
 * @author Hiroshige
 */
public class SimulatorThread extends Thread{
    
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println("Do simulator #" + i);
            try{
                System.out.println("Take a break of 10 miliseconds");
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
