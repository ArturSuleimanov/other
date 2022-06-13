package finalProject;

import java.util.Scanner;

public class Player {
    private int points;
    private String name;
    private Field field;
    private static Scanner inp = new Scanner(System.in);

    public Player(String name, Field field) {
        this.name = name;
        this.field = field;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public Field getField() {
        return field;
    }

    public void shoot(Player player) {
        boolean flag = true;
        int x = 0;
        int y = 0;
        while(true) {
            System.out.println("It's your turn " + this.getName() + ". Enter coordinates (x,y).");
            String lineCoords = inp.nextLine();
            if(!CoordsChecker.checkCoordsContainOnlyDigits(lineCoords)) return;
            String[] coords = lineCoords.split(",");

            if(coords.length!= 2) {
                System.out.println("Wrong format");
                continue;
            }
            x = Integer.parseInt(coords[0].strip());
            y = Integer.parseInt(coords[1].strip());
            if(x > 9 || y > 9 || x < 0 || y < 0) {
                System.out.println("Wrong format");
                continue;
            }
            if(player.getField().shoot(x, y)) {
                points++;
                if(points == 20) break;
            } else {
                System.out.println("Out of goal");
                break;
            }

        }
    }
}
