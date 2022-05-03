package ru.Artur.myFirstSpring;

import org.springframework.stereotype.Component;


public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Can't stop";
    }
}
