package day6;

import java.util.HashMap;
import java.util.Map;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Map<Integer, String> map= new HashMap<>();
        map.put(2, "неудовлетворительно");
        map.put(3, "удовлетворително");
        map.put(4, "хорошо");
        map.put(5, "отлично");
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                " по предмету " + subject + " на оценку " + map.get(2 + (int)(Math.random() * ((5 - 2) + 1))));
    }

}
