package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParseFile {
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String[] numbers = scanner.nextLine().split(" ");
        double sum = 0;
        for (String i: numbers) sum += Integer.parseInt(i);
        double result = sum / numbers.length;
        System.out.printf("%f --> %.3f", result, result);
    }
}
