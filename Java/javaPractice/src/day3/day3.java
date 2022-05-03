package day3;
import java.util.Scanner;
public class day3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String st = inp.nextLine();



        while(!st.equals("Stop")) {
            if(st.equals("Москва") || st.equals("Владивосток") || st.equals("Ростов")) System.out.println("Россия");
            else if(st.equals("Рим") || st.equals("Милан") || st.equals("Турин")) System.out.println("Италия");
            else if(st.equals("Ливерпуль") || st.equals("Манчестер") || st.equals("Лондон")) System.out.println("Англия");
            else if(st.equals("Берлин") || st.equals("Мюнхен") || st.equals("Кёльн")) System.out.println("Германия");
            else System.out.println("Неизвестная страна");
            st = inp.nextLine();
            };
        System.out.println("---------------------------------------------------------");

        double dividible = inp.nextDouble();
        double dividor =inp.nextDouble();
        while(dividor != 0) {
            System.out.println(dividible / dividor);
            dividible = inp.nextDouble();
            dividor = inp.nextDouble();
        }
        System.out.println("---------------------------------------------------------");
        for (int i=0; i<5; i++) {
            dividible = inp.nextDouble();
            dividor = inp.nextDouble();
            if (dividor == 0) {System.out.println("Деление на 0"); continue;};
            System.out.println(dividible / dividor);
        }
        };

    }

