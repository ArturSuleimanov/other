package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        PrintWriter printWriter1 = new PrintWriter(file1);
        PrintWriter printWriter2 = new PrintWriter(file2);
        Scanner scanner1 = new Scanner(file1);
        Scanner scanner2 = new Scanner(file2);

        for (int i = 0; i<1000; i++)  {
            printWriter1.print((int) rnd(100) + " ");
            if(i == 999) printWriter1.print((int) rnd(100));
        }

        printWriter1.close();

        String[] numbers = scanner1.nextLine().split(" ");
        for(int i = 20; i<=1000; i += 20) {
            float sum = 0;
            for(int j=i -20; j <= i; j++) sum += Integer.parseInt(numbers[j]);
            printWriter2.print(sum / 20 + " ");
        }

        printWriter2.close();

        long sum = 0;

        for (String i: scanner2.nextLine().split(" ")) sum += (long) Float.parseFloat(i);

        System.out.println(sum);
        scanner1.close();
        scanner2.close();




    }
    public static double rnd(int max) {
        return Math.random() * max;
    }
}
