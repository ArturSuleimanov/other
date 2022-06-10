package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("group1", 2000, new ArrayList<String>(Arrays.asList("Paul", "Fred")));
        MusicBand band2 = new MusicBand("group2", 2000, new ArrayList<String>(Arrays.asList("Artur", "Andrey")));
        band1.transferMembers(band2);
        band1.printMembers();
        band2.printMembers();

    }


}
