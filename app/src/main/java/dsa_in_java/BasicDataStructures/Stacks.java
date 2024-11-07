package dsa_in_java.BasicDataStructures;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Stacks {

    /*
     * Java has a built-in Stack class in the java.util package, 
     * but it's often recommended to use Deque (Double-Ended Queue) implementations, 
     * such as ArrayDeque or LinkedList, for better performance and flexibility. 
     * Here’s an example using both Stack and ArrayDeque
     * 
     * Storing names of 5 people
     */

    public static void main(String[] args) {
        // Declaring the stack
        Stack<String> stackOne = new Stack<>();

        //Pushing values in stack
        stackOne.push("Aman");
        stackOne.push("Ruroni");
        stackOne.push("Totome");
        stackOne.push("Kajarai");
        stackOne.push("Sujuke");


        //Printing Stack
        System.out.println("Stack One: "+ stackOne);

        //Peeking first element "Sujuke"
        System.out.println("Stack peek: "+ stackOne.peek());

        //Popping element from Stack "Sujuke"
        System.out.println("Stack pop: "+ stackOne.pop());


        //Declaring Deque (double ended queue)
        Deque<String> dequeStack = new ArrayDeque<>();

        //Pushing values in stack
        dequeStack.push("Aman");
        dequeStack.push("Ruroni");
        dequeStack.push("Totome");
        dequeStack.push("Kajarai");
        dequeStack.push("Sujuke");

        //Printing Stack
        System.out.println("Deque Stack: "+ dequeStack);

        //Peeking first element "Sujuke"
        System.out.println("Deque Stack peek: "+ dequeStack.peek());

        //Popping element from Stack "Sujuke"
        System.out.println("Deque Stack pop: "+ dequeStack.pop());

        //Poll element from Stack "Kajarai" (poll() will return null when no element is present in the stack)
        System.out.println("Deque Stack poll: "+ dequeStack.poll());
        
    }
}
