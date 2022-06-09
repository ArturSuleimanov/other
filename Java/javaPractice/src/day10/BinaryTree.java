package day10;

import static day10.Node.printSortedBinaryTree;

public class BinaryTree {
    private Node root;

    public BinaryTree(long value) {
        root = new Node(value);
    }


    public void add(long value) {
        root.add(value);
    }

    public Node getRoot() {
        return root;
    }

    public void printBinaryTree() {
        printSortedBinaryTree(root);

    }
}
