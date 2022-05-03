package day1;

public class day1 {
    public static void main(String[] args) {
        int n = 0;
        while(n++<10) System.out.print("JAVA ");
        System.out.println();
        System.out.println("---------------------------------------------------------");
        for(int i = 0; i<10; i++) System.out.print("JAVA ");
        System.out.println();
        System.out.println("---------------------------------------------------------");
        while(n--!=1) System.out.println("JAVA");
        System.out.println("---------------------------------------------------------");
        int year = 1980;
        while (year<=2020) {
            System.out.printf("Олимпиада %d года", year);
            System.out.println();
            year += 4;
        };

        System.out.println("---------------------------------------------------------");
        for(int i = 1980; i<=2020; i+=4) {
            System.out.printf("Олимпиада %d года", i);
            System.out.println();
        }
        System.out.println("---------------------------------------------------------");

        int k = 9;
        for(int i = 1; i<=9; i++) {
            System.out.printf("%d x %d = %d", i, k, i*k);
            System.out.println();
        }


    }
}
