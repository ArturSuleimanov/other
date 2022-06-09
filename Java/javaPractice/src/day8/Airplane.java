package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private double fuel;

    Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length =length;
        this.weight = weight;
        this.fuel =0;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public void setLength(int length) {
        this.length = length;
    }

    public double fillUp(double fuel) {
        this.fuel += fuel;
        return this.fuel;
    }

    public double getFuel() {return fuel;}
//    public void info() {
//        System.out.printf("Изготовитель: %s, год выпуска: %s, длина: %d, вес: %d, количество топлива в баке: " + fuel,
//                producer, year, length, weight);
//    }


    @Override
    public String toString() {
        return String.format(
                "Изготовитель: %s, год выпуска: %s, длина: %d, вес: %d, количество топлива в баке: " +
                        fuel,
                        producer,
                        year,
                        length,
                        weight
        );
    }
}
