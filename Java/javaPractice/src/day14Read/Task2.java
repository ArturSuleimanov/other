package day14Read;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> people = ReadFile.parseFileToStringList();
        people.stream().forEach(System.out::println);
    }
}
