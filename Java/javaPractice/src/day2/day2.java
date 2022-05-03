package day2;
import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int floors = inp.nextInt();
        if (floors >= 1 && floors <= 4) System.out.println("Малоэтажный дом");
        else if(floors >= 5 && floors <= 8) System.out.println("Среднеэтажный дом");
        else if(floors >= 9) System.out.println("Многоэтажный дом");
        else System.out.println("Ошибка ввода");
        System.out.println("---------------------------------------------------------");
        int a = inp.nextInt();
        int b = inp.nextInt();
        if(a>=b) System.out.println("Некорректный ввод");
        for(int i = a+1; i<b; i++) if(i % 5 == 0 && i % 10 != 0) System.out.print(i + " ");
        System.out.println();
        System.out.println("---------------------------------------------------------");
        a++;
        while(a++<b) if(a % 5 == 0 && a % 10 != 0) System.out.print(a + " ");
        System.out.println();
        System.out.println("---------------------------------------------------------");
        double x = inp.nextDouble();
        if(x>=5) System.out.println("y = " + (x * x - 10)/(x + 7));
        else if(x>-3 && x<5) System.out.println("y = " + (x + 3) * (x * x - 2));
        else System.out.println(420);


    }
}
