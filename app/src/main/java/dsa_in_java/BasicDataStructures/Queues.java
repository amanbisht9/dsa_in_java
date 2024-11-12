package dsa_in_java.BasicDataStructures;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        //Queues using LinkedList saave 5 names
        Queue<String> queue = new LinkedList<>();

        queue.add("Aman");
        queue.add("Ruroni");
        queue.add("Totome");
        queue.add("Kajarai");
        queue.add("Sujuke");

        // Display the queue
        System.out.println("Queue after enqueues: " + queue); 

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue an element
        String removed = queue.remove();
        System.out.println("Dequeued element: " + removed); 

        // Display the queue after dequeue
        System.out.println("Queue after dequeue: " + queue);

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("-----------------------------------------------");

        //Queue using ArrayQueue save 5 names
        Queue<String> aQueue = new ArrayDeque<>();

        aQueue.offer("Aman");
        aQueue.offer("Ruroni");
        aQueue.offer("Totome");
        aQueue.offer("Kajarai");
        aQueue.offer("Sujuke");

        // Display the queue
        System.out.println("Queue after enqueues: " + aQueue);

        // Peek at the front element
        System.out.println("Front element: " + aQueue.peek());

        // Dequeue an element
        String remString = aQueue.poll();
        System.out.println("Dequeued element: " + remString);

        // Display the queue after dequeue
        System.out.println("Queue after dequeue: " + aQueue);

        // Check if the queue is empty
        System.out.println("Is queue empty? " + aQueue.isEmpty());





    }
}
