package dsa_in_java.BasicDataStructures.LinkedLists;

public class DoublyLinkedList {
    
    public static class DNode {
        
        int data;
        DNode prev;
        DNode next;

        DNode(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
        
    }

    private DNode head;
    private DNode tail;

    //Adding at element at the end of doubly linked list.
    public void dAdd(int data){
        DNode dNode = new DNode(data);
        if(head == null){
            head = dNode;
            tail = dNode;
        }else{
            tail.next = dNode;
            dNode.prev = tail;
            tail = dNode;
        }
    }

    //Remove the element from Doubly linked list.
    public void dRemove(){
        if(tail != null){
            if(tail == head){
                tail = null;
                head = null;
            }else{
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    //Display all elements in linked list
    public void dDisplay(){
        DNode curr = head;
        while(curr != null){
            System.out.print(curr.data + " <=> ");
            curr  = curr.next;
        }

        System.out.println("null");
    }



}
