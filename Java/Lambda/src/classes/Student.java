package classes;

public class Student {
    static final int weight = 100;
    public String name;
    public char sex;
    public int age;
    public int course;
    public double avgGrade;


    public  Student(String name, char sex, int age, int course, double avgGrade) {

        this.course = course;
        this.avgGrade = avgGrade;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }



}
