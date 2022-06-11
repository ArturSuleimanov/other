package day14Read;

import java.io.File;
import java.io.FileNotFoundException;


public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        ReadFile.printSumDigits(file);
    }
}
