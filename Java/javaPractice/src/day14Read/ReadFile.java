package day14Read;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static void printSumDigits(File file) throws FileNotFoundException {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            if(numbers.length != 10) throw new IllegalArgumentException();
            int sum = 0;
            for (String i: numbers) sum += Integer.parseInt(i);
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

    }

    public static List<String> parseFileToStringList() {
        File file = new File("people.txt");
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if(Integer.parseInt(line.split(" ")[1]) < 0) throw new IllegalArgumentException();
                people.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect input file");
        }

        return people;
    }



    public static List<Person> parseFileToObjList() {
        File file = new File("people.txt");
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] personInfo = line.split(" ");
                if(Integer.parseInt(personInfo[1]) < 0) throw new IllegalArgumentException();
                people.add(new Person(personInfo[0], Integer.parseInt(personInfo[1])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect input file");

        }
        return people;
    }
}
