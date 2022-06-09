package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Artur", "UEM-514");
        Teacher teacher = new Teacher("Uriy", "UER");
        student.printInfo();
        teacher.printInfo();
    }
}
