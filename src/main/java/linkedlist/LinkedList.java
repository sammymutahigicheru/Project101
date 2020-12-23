package linkedlist;

public class LinkedList {
    public static class Node{
        int data;
        Node next; //pointer
        public Node(int data){
            this.data = data;
        }
    }
    private Node head;
    //Takes O(1) time complexity
    public void addFront(int data){
        //create new node
        Node newNode = new Node(data);
        if(head == null){
            //make the new node the head
            head = newNode;
            return;
        }
        // set its next point to the head
        newNode.next = head;
        //set head point to the new node ,making it the head
        head = newNode;
    }
    //Takes O(1) time complexity
    public int getFirst() throws IllegalStateException {
        if(head == null){
            throw new IllegalStateException("Head is Empty");
        }
        return head.data;
    }
    public int getLast() throws IllegalStateException{
        if(head == null){
            throw new IllegalStateException("Empty List");
        }
        //get current node
        Node current = head;
        while (current.next != null){
            current = current.next; //O(n)
        }
        //we are at the tail
        return current.data;
    }
}
