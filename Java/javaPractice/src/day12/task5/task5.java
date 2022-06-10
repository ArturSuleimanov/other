package day12.task5;

import day12.task5.MusicBand;

import java.util.ArrayList;
import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand(
          "group1",
                1998,
                new ArrayList<MusicArtist>(Arrays.asList(new MusicArtist("Paul", 23), new MusicArtist("Fred", 22)))
        );

        MusicBand band2 = new MusicBand(
                "group2",
                2000,
                new ArrayList<MusicArtist>(Arrays.asList(new MusicArtist("Artur", 23), new MusicArtist("Andrey", 23)))

        );

        band1.printMembers();
        band2.printMembers();
        band1.transferMembers(band2);
        band1.printMembers();
        band2.printMembers();
    }
}
