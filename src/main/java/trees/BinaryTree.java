package trees;

/*
*A binary tree is a recursive data structure where each node can have 2 children at most.

A common type of binary tree is a binary search tree, in which every node has a value that is greater than or equal to the node values in the left sub-tree, and less than or equal to the node values in the right sub-tree.

Here's a quick visual representation of this type of binary tree:
*
* */
public class BinaryTree {
    Node root;

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
