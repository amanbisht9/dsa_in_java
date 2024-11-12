package dsa_in_java.BasicDataStructures.LinkedLists;

public class SinglyLinkedList {
    
    //Why inner class are static: https://www.geeksforgeeks.org/static-class-in-java/

    private static class Node {

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    
    private Node head;

    public void sAdd(int data){
        Node sNode = new Node(data);
        if(head == null){
            head = sNode;
        }else{
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = sNode;
        }
    }

    public void sRemove(){
        if(head != null){
            head = head.next;
        }
    }

    public void sDisplay(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    
}
