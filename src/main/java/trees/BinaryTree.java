package trees;

/*
*A binary tree is a recursive data structure where each node can have 2 children at most.

A common type of binary tree is a binary search tree, in which every node has a value that is greater than or equal to the node values in the left sub-tree, and less than or equal to the node values in the right sub-tree.

Here's a quick visual representation of this type of binary tree:
*
* */
public class BinaryTree {
    Node root;
   // public method that starts the recursion from the root node:
    public void add(int value){
        root = addRecursive(root,value);
    }
    /*
    * Insert Element
    *
    * First, we have to find the place where we want to add a new node in order to keep the tree sorted. We'll follow these rules starting from the root node:

if the new node's value is lower than the current node's, we go to the left child
if the new node's value is greater than the current node's, we go to the right child
when the current node is null, we've reached a leaf node and we can insert the new node in that position
    * */
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }
    //creates the binary tree
    public BinaryTree createBinaryTree(){
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

    //finding an element
    private boolean containsNodeRecursive(Node current, int value){
        if (current == null){
            return false;
        }
        if (value == current.value){
            return true;
        }
        return value < current.value ? containsNodeRecursive(current.left,value)
                : containsNodeRecursive(current.right, value);
    }
    public boolean containsNode(int value){
        return containsNodeRecursive(root,value);
    }

    /*
    *
    * Tree Traversal
    * Depth-first search is a type of traversal that goes deep as much as possible in every child before exploring the next sibling.
    *
    * */
    //Depth-first search is a type of traversal that goes deep as much as possible in every child before exploring the next sibling.
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

}

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
