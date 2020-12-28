package challenges.linkedlists;

class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;
    public DoublyLinkedListNode(int data){
        this.data = data;
    }
}

public class InsertNodeIntoDoublyLinkedListChallenge {
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        //create new node
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if(head == null) return newNode;
        //current node
        DoublyLinkedListNode current = head;
        //previous node
        DoublyLinkedListNode previous = null;
        //first edge case: data < current.data
        if(data < current.data){ //insert at the head
            newNode.next = current;
            newNode.prev = null;
            current.prev = newNode;
            return newNode;
        }
        //move to the back of the list
        while(current != null && data > current.data){
            previous = current;
            current = current.next;
        }
        //Second edge case: when we are at the end of the list
        if(current == null){
            newNode.prev = previous;
            newNode.next = null;
            previous.next = newNode;
            return head;
        }
        //Third edge case: At the middle of the list
        newNode.prev = previous;
        newNode.next = previous.next;
        previous.next = newNode;
        newNode.next.prev = newNode;

        return head;
    }
}
