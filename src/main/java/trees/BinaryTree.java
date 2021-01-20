package trees;

/*
*A binary tree is a recursive data structure where each node can have 2 children at most.

A common type of binary tree is a binary search tree, in which every node has a value that is greater than or equal to the node values in the left sub-tree, and less than or equal to the node values in the right sub-tree.

Here's a quick visual representation of this type of binary tree:
*
* */
public class BinaryTree {
    Node root;
}
class Node{
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value = value;
        right = null;
        left = null;
    }
}
