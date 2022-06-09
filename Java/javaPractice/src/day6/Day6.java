package day6;

public class Day6 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2022, 100, 500);
        airplane.setLength(99);
        airplane.setYear(2021);
        airplane.fillUp(50);
        airplane.fillUp(30);
        airplane.info();
        System.out.println();
        System.out.println("---------------------------------------------------------");
        Teacher teacher = new Teacher("Ivan Ivanovich", "math");
        Student student = new Student("Ivan");
        teacher.evaluate(student);



    }
}
