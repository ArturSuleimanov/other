package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }


    public void transferMembers(MusicBand musicBand) {
        this.members.addAll(musicBand.members);
        musicBand.members.clear();
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public void printMembers() {
        System.out.println(members);
    }
}
