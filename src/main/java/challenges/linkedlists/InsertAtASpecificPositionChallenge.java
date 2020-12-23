package challenges.linkedlists;

public class InsertAtASpecificPositionChallenge {
    // Complete the insertNodeAtPosition function below.
    static class SinglyLinkedListNode {
          int data;
          SinglyLinkedListNode next;
          public SinglyLinkedListNode(int data){
              this.data = data;
          }
     }
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        //new node
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        int count = 0;
        //current node
        SinglyLinkedListNode current = head;
        while(count < position-1){
            current = current.next;
            count++;
        }
        //point the new node to the current node
        newNode.next = current.next;
        //point the current node to new_node
        current.next = newNode;
        return head;
    }
}
