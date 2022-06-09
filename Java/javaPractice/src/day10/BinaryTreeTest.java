package day10;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(20);


        int[] numbers = {14, 11, 5, 8, 16, 15, 18, 23, 22, 27, 24, 150};
        for(int n: numbers) binaryTree.add(n);
        binaryTree.printBinaryTree();
    }
}
