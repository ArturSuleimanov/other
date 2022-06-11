package day15ReadWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("files/shoes.csv");
        File outputFile = new File("files/outOfStock.txt");

        PrintWriter printWriter = new PrintWriter(outputFile);
        Scanner scanner = new Scanner(inputFile);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] shoesInfo = line.split("; ");
            if (Integer.parseInt(shoesInfo[shoesInfo.length - 1]) == 0) printWriter.println(line);
        }
        scanner.close();
        printWriter.close();
    }
}
