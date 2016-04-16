
package modulo9.test;

import java.util.PriorityQueue;

/**
 *
 * @author Roberto Olveras
 */
public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(5);
        System.out.println(pq);
        pq.offer(3);
        System.out.println(pq);
        pq.offer(8);
        System.out.println(pq);
        pq.offer(1);
        System.out.println(pq);
        pq.offer(4);
        System.out.println(pq);
        System.out.println("pq.poll(): "+pq.poll());
        System.out.println(pq);
        System.out.println("pq.poll(): "+pq.poll());
        System.out.println(pq);
        System.out.println("pq.poll(): "+pq.poll());
        System.out.println(pq);
        System.out.println("pq.poll(): "+pq.poll());
        System.out.println(pq);
        System.out.println("pq.poll(): "+pq.poll());
        System.out.println(pq);
        
    }
}
