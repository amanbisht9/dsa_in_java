package dsa_in_java.BasicDataStructures.LinkedLists;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();

        //Add data in linked list.
        linkedList.add("Aman");
        linkedList.add("Heronika");
        linkedList.add("Moksha");
        linkedList.add("Yuvraj");
        linkedList.add("Yashveer");

        //Display linked list
        System.out.println("Printing linked list: "+linkedList);

        // Add elements at specific positions
        linkedList.addFirst("Zara"); // Add at the beginning
        linkedList.addLast("Tom");   // Add at the end

        //Display linked list
        System.out.println("After adding first and last: " + linkedList);

        // Accessing elements
        System.out.println("First element: " + linkedList.getFirst()); // Output: Zara
        System.out.println("Last element: " + linkedList.getLast());   // Output: Tom

        // Removing elements
        linkedList.removeFirst(); // Removes "Zara"
        linkedList.removeLast();  // Removes "Tom"

        //Display linked list
        System.out.println("After removing first and last: " + linkedList);

        // Check if list contains an element
        System.out.println("Contains 'Aman': " + linkedList.contains("Aman")); // Output: true

        // Size of LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());

        System.out.println("---------------------- Singly Linked List -----------------------");

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        //Add items in linked list
        singlyLinkedList.sAdd(1);
        singlyLinkedList.sAdd(2);
        singlyLinkedList.sAdd(3);
        singlyLinkedList.sAdd(4);
        singlyLinkedList.sAdd(5);

        //Display linked list
        System.out.print("Display linked list: ");singlyLinkedList.sDisplay();

        //Remove element from beginning of linked list
        singlyLinkedList.sRemove();

        //Display linked list
        System.out.print("Display linked list: ");singlyLinkedList.sDisplay();


        System.out.println("---------------------- Doubly Linked List -----------------------");

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        //Add items in doubly linked list
        doublyLinkedList.dAdd(1);
        doublyLinkedList.dAdd(2);
        doublyLinkedList.dAdd(3);
        doublyLinkedList.dAdd(4);
        doublyLinkedList.dAdd(5);

        //Display doubly linked list
        System.out.print("Doubly linked list: ");doublyLinkedList.dDisplay();

        //Remove element from end of doubly linked list
        doublyLinkedList.dRemove();

        //Display doubly linked list
        System.out.print("Display linked list: ");doublyLinkedList.dDisplay();


    }
}
