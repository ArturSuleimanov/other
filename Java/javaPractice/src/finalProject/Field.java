package finalProject;

import java.util.Arrays;
import java.util.Scanner;

public class Field {
    private FieldPart[][] field;
    private final Scanner inp = new Scanner(System.in);

    private boolean horizontalDirection;



    public Field() {
        field = new FieldPart[10][10];
        for(int i = 0; i<10; i++) for(int j = 0; j<10; j++) field[i][j] = FieldPart.EMPTY;
    }

    private boolean checkCoordsLen(String[] coords, int length){
        if(coords.length > length) {
            System.out.println("Wrong input format!");
            return false;
        }
        return true;
    }

    public boolean setFourth() {
        System.out.println("Enter coordinates of fourth floor ship (format: x,y;x,y;x,y;x,y)");
        String lineCoords = inp.nextLine();
        if(!CoordsChecker.checkCoordsContainOnlyDigits(lineCoords)) return false;
        String[] coords = lineCoords.split(";");



        if(!checkCoordsLen(coords, 4)) return false;
        checkHorizontalDirection(coords);
        if(!this.checkCoords1(coords)) return false;
        for(int i = 1; i<4; i++) if(!this.checkCoords(i, coords)) return false;
        Arrays.stream(coords).forEach(el->Ship.FOURTH_DECKER.getPlacement().add(el));
        setCoords1(coords);
        setMiddleCoords(coords,1);
        setMiddleCoords(coords,2);
        setFinalCoords(coords);



        return true;

    }

    public boolean setThird(int count) {
        System.out.println("Enter coordinates of three floor ship (format: x,y;x,y;x,y)");
        String lineCoords = inp.nextLine();
        if(!CoordsChecker.checkCoordsContainOnlyDigits(lineCoords)) return false;
        String[] coords = lineCoords.split(";");
        if(!checkCoordsLen(coords, 3)) return false;
        checkHorizontalDirection(coords);
        if(!this.checkCoords1(coords)) return false;
        for(int i = 1; i<3; i++) if(!this.checkCoords(i, coords)) return false;

        switch (count) {
            case 1:
                Arrays.stream(coords).forEach(el->Ship.TRIPLE_DECKER_1.getPlacement().add(el));
                break;
            case 2:
                Arrays.stream(coords).forEach(el->Ship.TRIPLE_DECKER_2.getPlacement().add(el));
                break;
        }

        setCoords1(coords);
        setMiddleCoords(coords,1);
        setFinalCoords(coords);
        return true;
    }

    public boolean setTwo(int count) {
        System.out.println("Enter coordinates of two floor ship (format: x,y;x,y)");
        String lineCoords = inp.nextLine();
        if(!CoordsChecker.checkCoordsContainOnlyDigits(lineCoords)) return false;
        String[] coords = lineCoords.split(";");
        if(!checkCoordsLen(coords, 2)) return false;
        checkHorizontalDirection(coords);
        if(!this.checkCoords1(coords)) return false;
        for(int i = 1; i<2; i++) if(!this.checkCoords(i, coords)) return false;

        switch (count) {
            case 1:
                Arrays.stream(coords).forEach(el->Ship.DOUBLE_DECKER_1.getPlacement().add(el));
                break;
            case 2:
                Arrays.stream(coords).forEach(el->Ship.DOUBLE_DECKER_2.getPlacement().add(el));
                break;
            case 3:
                Arrays.stream(coords).forEach(el->Ship.DOUBLE_DECKER_3.getPlacement().add(el));
                break;
        }

        setCoords1(coords);
        setFinalCoords(coords);
        return true;
    }

    public boolean setOne(int count) {
        System.out.println("Enter coordinates of one floor ship (format: x,y)");
        String lineCoords = inp.nextLine();
        if(!CoordsChecker.checkCoordsContainOnlyDigits(lineCoords)) return false;
        String[] coords = lineCoords.split(";");
        if(!checkCoordsLen(coords, 1)) return false;
        horizontalDirection = true;
        if(!this.checkCoords1(coords)) return false;

        switch (count) {
            case 1:
                Arrays.stream(coords).forEach(el->Ship.SINGLE_1.getPlacement().add(el));
                break;
            case 2:
                Arrays.stream(coords).forEach(el->Ship.SINGLE_2.getPlacement().add(el));
                break;
            case 3:
                Arrays.stream(coords).forEach(el->Ship.SINGLE_3.getPlacement().add(el));
                break;
            case 4:
                Arrays.stream(coords).forEach(el->Ship.SINGLE_4.getPlacement().add(el));
                break;
        }

        setCoords1(coords);
        setFinalCoords(coords);
        return true;
    }

    private void setFinalCoords(String[] coords) {
        Object[] coords1 = parseCoords(coords.length-1, coords);
        int x = (int) coords1[0];
        int y = (int) coords1[1];
        field[y][x] = FieldPart.SHIP;
        if(horizontalDirection) {
            if(x != 9) {
                field[y][x + 1] = FieldPart.BORDER;
                if(y!= 0) {
                    field[y-1][x+1] = FieldPart.BORDER;
                    field[y-1][x] = FieldPart.BORDER;
                }
                if(y!=9) {
                    field[y+1][x+1] = FieldPart.BORDER;
                    field[y+1][x] = FieldPart.BORDER;
                }
            } else {
                if(y!= 0) field[y-1][x] = FieldPart.BORDER;
                if(y!=9) field[y+1][x] = FieldPart.BORDER;
            }
        } else {
            if(y != 9) {
                field[y + 1][x] = FieldPart.BORDER;
                if(x!= 0) {
                    field[y+1][x-1] = FieldPart.BORDER;
                    field[y][x-1] = FieldPart.BORDER;
                }
                if(x!=9) {
                    field[y+1][x+1] = FieldPart.BORDER;
                    field[y][x+1] = FieldPart.BORDER;
                }
            } else {
                if(x!= 0) field[y][x-1] = FieldPart.BORDER;
                if(x!=9) field[y][x+1] = FieldPart.BORDER;
            }
        }
    }

    private void setMiddleCoords(String[] coords, int position) {
        Object[] coords1 = parseCoords(position, coords);
        int x = (int) coords1[0];
        int y = (int) coords1[1];
        field[y][x] = FieldPart.SHIP;
        if(horizontalDirection) {
            if(y != 0) field[y-1][x] = FieldPart.BORDER;
            if(y != 9) field[y+1][x] = FieldPart.BORDER;
        } else {
            if(x != 0) field[y][x-1] = FieldPart.BORDER;
            if(x != 9) field[y][x+1] = FieldPart.BORDER;
        }
    }


    private void setCoords1(String[] coords) {
        Object[] coords1 = parseCoords(0, coords);
        int x = (int) coords1[0];
        int y = (int) coords1[1];
        field[y][x] = FieldPart.SHIP;
        if(horizontalDirection) {
            if(x != 0) {
                field[y][x - 1] = FieldPart.BORDER;
                if(y!= 0) {
                    field[y-1][x-1] = FieldPart.BORDER;
                    field[y-1][x] = FieldPart.BORDER;
                }
                if(y!=9) {
                    field[y+1][x-1] = FieldPart.BORDER;
                    field[y+1][x] = FieldPart.BORDER;
                }
            } else {
                if(y!= 0) field[y-1][x] = FieldPart.BORDER;
                if(y!=9) field[y+1][x] = FieldPart.BORDER;
            }
        } else {
            if(y != 0) {
                field[y - 1][x] = FieldPart.BORDER;
                if(x!= 0) {
                    field[y-1][x-1] = FieldPart.BORDER;
                    field[y][x-1] = FieldPart.BORDER;
                }
                if(x!=9) {
                    field[y-1][x+1] = FieldPart.BORDER;
                    field[y][x+1] = FieldPart.BORDER;
                }
            } else {
                if(x!= 0) field[y][x-1] = FieldPart.BORDER;
                if(x!=9) field[y][x+1] = FieldPart.BORDER;
            }
        }
    }

    private static Object[] parseCoords(int position, String[] coords) {
        return  Arrays.stream(coords[position].split(",")).map(el->Integer.parseInt(el.strip())).toArray();
    }









    private void checkHorizontalDirection(String[] coords) {
        Object[] coords1 = parseCoords(0, coords);
        int y1 = (int) coords1[1];
        Object[] coords2 = parseCoords(1, coords);
        int y2 = (int) coords2[1];
        horizontalDirection = y1 == y2;
    }





    private boolean checkBusiness(int x, int y) {
        if(!field[y][x].equals(FieldPart.EMPTY)) {
            System.out.printf("Cell with coordinates (%d; %d) is busy!\n", x, y);
            return false;
        }
        return true;
    }


    private boolean checkCoords1(String[] coords) {
        Object[] coords1 = parseCoords(0, coords);
        int x1 = (int) coords1[0];
        int y1 = (int) coords1[1];
        if(!CoordsChecker.checkValue(x1, y1)) return false;
        return this.checkBusiness(x1, y1);
    }


    private boolean checkCoords(int position, String[] coords) {
        Object[] coords1 = parseCoords(0, coords);
        int x1 = (int) coords1[0];
        int y1 = (int) coords1[1];
        Object[] coords2 = parseCoords(position, coords);
        int x2 = (int) coords2[0];
        int y2 = (int) coords2[1];
        if(!CoordsChecker.checkValue(x2, y2)) return false;
        if(!this.checkBusiness(x2, y2)) return false;
        if(horizontalDirection && x2 - x1 != position) {
            System.out.println("Ship must be a line!");
            return false;
        } else if(!horizontalDirection && y2 - y1 != position) {
            System.out.println("Ship must be a line!");
            return false;
        }
        return true;
    }






    public void print() {
        for(FieldPart[] parts: field) {
            Arrays.stream(parts).forEach(el->System.out.print(el.getValue()));
            System.out.println();
        }
    }

    public boolean shoot(int x, int y) {
        if(field[y][x].equals(FieldPart.SHIP)) {
            field[y][x] = FieldPart.STRIKEN;
            for(Ship ship: Ship.values()) {
                if(ship.getPlacement().contains(x + "," + y)) {
                    ship.getPlacement().remove(x + "," + y);
                    if(ship.getPlacement().isEmpty()) {System.out.println("Drown!");} else System.out.println("Accurate!");;
                }
            }
            return true;
        }
        return false;
    }




}



