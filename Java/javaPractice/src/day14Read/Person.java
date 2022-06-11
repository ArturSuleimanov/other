package day14Read;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.age =age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
