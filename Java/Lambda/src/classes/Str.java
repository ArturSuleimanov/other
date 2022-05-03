package classes;

public class Str {
    public static void main (String[] args) {
        Test((String str) -> {return str.length();});
    }


    public static void Test (St s) {
        System.out.print(s.abs("privet"));
    }
}

interface St {
    public int abs(String string);
}
