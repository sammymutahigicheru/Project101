package challenges.trees;

public class TreeHeight {



    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int value){
        this.data = value;
    }
}
