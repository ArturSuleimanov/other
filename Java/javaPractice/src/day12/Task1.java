package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<String> listAutos = new ArrayList<>();
        listAutos.add("Shkoda");
        listAutos.add("Mazda");
        listAutos.add("Honda");
        listAutos.add("Toyota");
        listAutos.add("Porshe");
        System.out.println(listAutos);
        listAutos.add(2, "Mercedes");
        listAutos.remove(0);
        System.out.println(listAutos);
    }
}
