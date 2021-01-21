package challenges.trees;

public class TreeHeight {

    public static int height(Node root) {
        // Write your code here.
        int rightHeight = 0;
        int leftHeight = 0;
        if(root == null){
            return 0;
        }
        if(root.right != null){
            rightHeight = 1 + height(root.right);
        }

        if(root.left != null){
            leftHeight = 1 + height(root.left);
        }


        return leftHeight > rightHeight ? leftHeight : rightHeight;


    }

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
