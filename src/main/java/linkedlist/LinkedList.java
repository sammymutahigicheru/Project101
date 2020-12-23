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
    //Takes O(n) time complexity
    public void addBack(int data){
        //create new node
        Node newNode = new Node(data);
        //if list is empty set the new node to be the current head
        if(head == null){
            head = newNode;
            return;
        }
        //start at the head
        Node currentNode = head;

        //walk back to node = null
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }

        //set current.next = newNode
        currentNode.next = newNode;

    }
    //Takes O(n) time complexity
    public int size(){
        if (head == null){
            return 0;
        }
        int count = 1;
        //count the number of iterations
        Node current = head;
        while(current.next != null){
            current = current.next;
            count++;
        }
        return count;
    }
    // Takes O(1) time complexity
    public void clear(){
        //set the head to null
        head = null;
    }
}
