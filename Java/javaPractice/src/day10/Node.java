package day10;

public class Node {
    private Node right;
    private Node left;
    private long value;

    public Node(long value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public void add(long value) {
        if(this.value <= value){
            if(this.right == null) {
                this.right = new Node(value);
            } else this.right.add(value);
        } else {
            if(this.left == null) {
                this.left = new Node(value);
            } else this.left.add(value);
        }
    }


    public Node getRight() {
        return right;
    }



    public Node getLeft() {
        return left;
    }


    public long getValue() {
        return value;
    }


    public Node getMinElemet() {
        if(this.left != null) return this.left.getMinElemet();
        return this;
    }


    public static void printSortedBinaryTree(Node node) {
        if (node != null) {
            printSortedBinaryTree(node.left);
            System.out.print(" " + node.value);
            printSortedBinaryTree(node.right);
        }
    }
}
