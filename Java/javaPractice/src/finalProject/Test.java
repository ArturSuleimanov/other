package finalProject;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String running = "";
        do {
            Field field1 = new Field();
            Field field2 = new Field();
            System.out.println("Let's get started placing ships on the field (Player1). Second player don't watch!");
            Process.filling(field1);
            System.out.println("Now it's your turn Player2. First player don't watch!");
            Process.filling(field2);
            Process.play(field1, field2);
            System.out.println("Do you want to play once more (type 'YES')?");
            running = inp.nextLine();
        } while (running.equals("YES"));
        System.out.println("Goodbye!");




//  0,0;0,1;0,2;0,3
//  2,6;2,7;2,8
//  3,2;4,2;5,2
//  4,4;4,5
//  7,2;7,3
//  9,8;9,9
//  2,0
//  9,0
//  7,6
//  4,8
    }
}
