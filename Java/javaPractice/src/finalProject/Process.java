package finalProject;

public class Process {
    public static void setFour(Field field) {
        boolean flag;
        do {
            flag = field.setFourth();
        } while (!flag);
    }

    public static void setThird(Field field, int count) {
        boolean flag;
        do {
            flag = field.setThird(count);
        } while (!flag);
    }

    public static void setTwo(Field field, int count) {
        boolean flag;
        do {
            flag = field.setTwo(count);
        } while (!flag);
    }

    public static void setOne(Field field, int count) {
        boolean flag;
        do {
            flag = field.setOne(count);
        } while (!flag);
    }


    public static void filling(Field field) {
        Process.setFour(field);
        for(int i = 0; i<2; i++) Process.setThird(field, i + 1);
        for(int i= 0; i<3; i++) Process.setTwo(field, i + 1);
        for(int i = 0; i<4; i++ ) Process.setOne(field, i + 1);
    }


    public static void play(Field field1, Field field2) {
        String name1 = "Player1";
        String name2 = "Player2";
        Player player1;
        Player player2;
        if(Math.random() > 0.5) {
            player1 = new Player(name2, field2);
            player2 = new Player(name1, field1);
        } else {
            player1 = new Player(name1, field1);
            player2 = new Player(name2, field2);
        }

        while (true) {
            player1.shoot(player2);
            if(player1.getPoints() == 20) {
                System.out.println("You win!!!");
                break;
            }
            player2.shoot(player1);
            if(player2.getPoints() == 20) {
                System.out.println("You win!!!");
                break;
            }
        }
    }

}
