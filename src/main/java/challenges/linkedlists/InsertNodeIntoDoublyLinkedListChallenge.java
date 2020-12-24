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
    /*
    * Takes O(n) time complexity
    * */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        //create new node
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if(head == null){
            return newNode;
        }
        //current node
        DoublyLinkedListNode current = head;
        DoublyLinkedListNode previous = null;
        //first edge case: data < current.data
        if(data < current.data){
            newNode.next = current.next;
            newNode.prev = null;
            current.prev = newNode;
            return newNode;
        }
        //move to the back of the list
        if(current != null && data > current.data){
            previous = current;
            current = current.next;
        }
        if(current == null){
            newNode.prev = previous;
            newNode.next = null;
            previous.next = newNode;
        }else{
            newNode.prev = previous;
            newNode.next = previous.next;
            previous.next = newNode;
            newNode.next.prev = newNode;
        }

        return head;
    }
}
