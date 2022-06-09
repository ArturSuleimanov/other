package day7;

public class Player {
    private int stamina;
    public final int MAX_STAMINA = 100;
    public final int MIN_STAMINA = 0;
    static int countPlayers;

    Player() {
        stamina = 90 + (int)(Math.random() * ((100 - 90) + 1));
        if(countPlayers<6) countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina>0) stamina--;
        if(stamina == 0) countPlayers--;
    }

    public static void info() {
        if(countPlayers<6) System.out.println("Teams are not full! There are " + (6 -countPlayers) +" free places on the field");
        else System.out.println("Trere isn't any free space on the field!");
    }
}
