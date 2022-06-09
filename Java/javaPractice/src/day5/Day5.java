package day5;

public class Day5 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2022);
        car.setColour("grey");
        car.setModel("Mazda");
        System.out.println(car.getYear());
        System.out.println(car.getColour());
        System.out.println(car.getModel());
        System.out.println("---------------------------------------------------------");
        Bike bike = new Bike(2020, "red", "Harley Davidson");
        System.out.println(bike.getYear());
        System.out.println(bike.getColour());
        System.out.println(bike.getModel());
    }

}
