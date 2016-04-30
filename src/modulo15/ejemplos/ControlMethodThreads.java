package control;

/**
 *
 * @author Hiroshige
 */

public class ControlMethodThreads {

    public static void main(String[] args) {
        Thread t = new ExamThread();
        t.start();
    }
}
