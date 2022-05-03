import classes.Student;

import java.util.ArrayList;

public class Lambdas {
    public static void main(String[] args){
        Student st1 = new Student("Roma", 'm', 23, 3, 7);
        Student st2 = new Student("Ivan", 'm', 20, 5, 5);
        Student st3 = new Student("Slava", 'm', 25, 1, 9);
        Student st4 = new Student("Nika", 'f', 18, 2, 8);
        Student st5 = new Student("Lena", 'f', 19, 2, 7);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age > 20;
            }
        });
        System.out.println("-----------------------------------------------");
        StudentChecks sc = (Student s) -> {return s.age > 20;};
        testStudents(students, sc);


    }
    public static void testStudents(ArrayList<Student> listStudents, StudentChecks obj) {
        for (Student i: listStudents) {
            if(obj.check(i)) System.out.println(i.name);
        }
    }
}

interface StudentChecks {
    boolean check(Student s);
}