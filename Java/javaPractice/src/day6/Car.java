package day6;

public class Car {
    private int year;
    private String colour;
    private String model;

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {System.out.println("Это автомобиль");}
    public int yearDifference(int num) {return Math.abs(num - year);}


}
