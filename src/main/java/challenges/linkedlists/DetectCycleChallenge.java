package challenges.linkedlists;
/*
*Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
*
* */
public class DetectCycleChallenge {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    //Takes O(n) time complexity
    boolean hasCycle(Node head) {
        if(head == null) return false;
        //fast node
        Node fast = head.next;
        //slow node
        Node slow = head;
        while(fast != null && fast.next != null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        //traversed to the end without detecting a cycle
        return false;
    }

}
