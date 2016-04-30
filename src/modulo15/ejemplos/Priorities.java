package control;


import java.util.Random;


/**
 *
 * @author Hiroshige
 */
public class Priorities {

    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            Thread t = new MyThread("Hilo"+i,i);
            t.start();
        }
    }
}

class MyThread extends Thread{
   
    public MyThread(String name, int priority){
        this.setName(name);
        this.setPriority(priority);
    }
    
    public void run(){
        System.out.println("Name: " + this.getName() + " priority: " + this.getPriority());
    }
    
}