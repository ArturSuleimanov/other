package ru.Artur.myFirstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

import static ru.Artur.myFirstSpring.MusicGenre.CLASSICAL;
import static ru.Artur.myFirstSpring.MusicGenre.ROCK;



public class MusicPlayer {



    private Music[] musicList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;




    MusicPlayer() {
    }




    MusicPlayer(Music ...musicList) {
        this.musicList = musicList;
    }


    public String playMusic() {
        int rnd = new Random().nextInt(3);
        return musicList[rnd].getSong() + " "+  name  + " " + volume;
    }



}



