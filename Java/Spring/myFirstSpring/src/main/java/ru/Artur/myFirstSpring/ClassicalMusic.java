package ru.Artur.myFirstSpring;

import org.springframework.stereotype.Component;


public class ClassicalMusic implements Music {
    public static ClassicalMusic getClassicalMusic() {
        System.out.println("I'm creating new object");
        return new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Vanishing...");
    }
    @Override
    public String getSong() {
        return "Dog's waltz";
    }
}
