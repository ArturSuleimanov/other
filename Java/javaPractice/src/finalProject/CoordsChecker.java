package finalProject;

public class CoordsChecker {
    public static boolean checkValue(int x, int y) {
        if(x > 9 || x < 0 || y > 9 || y < 0) {
            System.out.println("Координаты должны быть в переделах от 0 до 9!");
            return false;
        }
        return true;
    }

    public static boolean checkCoordsContainOnlyDigits(String coords) {
        for (int i = 0; i < coords.length(); i++) {
            if (coords.charAt(i) != ';' && coords.charAt(i) != ',' && !Character.isDigit(coords.charAt(i))) {
                System.out.println("Wrong input format!");
                return false;
            }
        }
        return true;
    }
}
