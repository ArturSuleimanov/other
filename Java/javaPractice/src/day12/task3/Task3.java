package day12.task3;

import day12.task3.MusicBand;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = Arrays.asList(new MusicBand("group1", 1999), new MusicBand("group2", 1999),
                new MusicBand("group3", 1999), new MusicBand("group4", 1999), new MusicBand("group 5", 1999),
                new MusicBand("group6", 2001), new MusicBand("group7", 2001), new MusicBand("group8", 2001),
                new MusicBand("group8", 2001), new MusicBand("group9", 2001), new MusicBand("group10", 2001));
        System.out.println(musicBands);
        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println(groupAfter2000(musicBands));
    }


    public static List<MusicBand> groupAfter2000(List<MusicBand> musicBands) {
         return musicBands.stream().filter(element -> element.getYear() > 2000).toList();
    }
}
