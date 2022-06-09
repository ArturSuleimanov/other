package day8;

import java.time.Duration;
import java.time.Instant;

public class Task1 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        String out1 = "0";
        for(int i = 1; i<=20000; i++) out1 +=(" " + i);
        Instant finish = Instant.now();
        System.out.println(out1);
        System.out.println(Duration.between(start, finish).toMillis());


        start = Instant.now();
        StringBuilder out2 = new StringBuilder(20000);
        for(int i = 0; i<=20000; i++) out2.append(i + " ");
        finish = Instant.now();
        System.out.println(out2.toString());
        System.out.println(Duration.between(start, finish).toMillis());


    }
}
