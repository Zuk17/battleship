package battleship;

import java.util.ArrayList;

public class Field {
    private int sizeA = 10;
    private int size1 = 10;
    private Mark[][] field;
    private char[] rows = new char[sizeA];
    private String columns;

    ArrayList<Ship> ListShips = new ArrayList<>();

    public Field() {
        Init();
    }

    public Field(int sizeA, int size1) {
        this.sizeA = sizeA;
        this.size1 = size1;
        rows = new char[sizeA];
        Init();
    }

    private void Init() {
        field = new Mark[sizeA][size1];

        for (int i = 0; i < sizeA; i++)
            for (int j = 0; j < size1; j++)
                field[i][j] = Mark.FOG;

        rows[0] = 'A';
        StringBuilder columnStr = new StringBuilder(" "); //may be more spaces for field over 26

        //Create header for field
        for (int i = 1; i <= size1; i++) {
            columnStr.append(" ").append(i);
        }
        columns = columnStr.toString();

        //create first field column
        int j = 0;
        for (char a = 'A'; a <= 'Z'; a++) {
            if (j >= sizeA) break;
            rows[j] = a;
            j++;
        }
    }

    public void addShip(String name, int length) {
        ListShips.add(new Ship(name, length));
    }

    // Print field
    public String printField() {
        StringBuilder output = new StringBuilder(columns).append("\n");
        for (int i = 0; i < sizeA; i++)
            output.append(rows[i]).append(" ").append(str(field[i])).append("\n");
        return output.toString();
    }

    // sub method for printing field
    private String str(Mark[] a) {
        StringBuilder output = new StringBuilder();
        for (Mark b : a)
            output.append(b.valueOf()).append(" ");
        return output.toString();
    }

    public boolean addShipToField(Ship a, Coordinate begin, Coordinate end) {

//        System.out.println("Trying add ship to field");

        //check location
        if (!checkLocation(begin, end)) {
            System.out.println("\nError! Wrong ship location! Try again:\n");
            return false;
        }

        //Check length
        if (!a.checkLength(begin, end)) {
            System.out.println("\nError! Wrong length of the " + a.printName() + "! Try again:\n");
            return false;
        }

        if (!checkArea(begin, end)) {
            System.out.println("\nError! You placed it too close to another one. Try again:\n");
            return false;
        }

        a.setCoords(begin, end); //для корабля
        setCoords(begin, end); //для поля

        System.out.println("ship added");
        return true;
    }

    private void setCoords(Coordinate begin, Coordinate end) {
        int minX = Math.min(begin.getX(), end.getX());
        int maxX = Math.max(begin.getX(), end.getX());
        int minY = Math.min(begin.getY(), end.getY());
        int maxY = Math.max(begin.getY(), end.getY());

        for (int i = minX; i <= maxX; i++)
            for (int j = minY; j <= maxY; j++)
                field[i - 1][j - 1] = Mark.SHIP;
    }

    private boolean checkArea(Coordinate begin, Coordinate end) {
        int minX = Math.min(begin.getX(), end.getX());
        int maxX = Math.max(begin.getX(), end.getX());
        int minY = Math.min(begin.getY(), end.getY());
        int maxY = Math.max(begin.getY(), end.getY());

        if (minX > 1) minX--;
        if (maxX < sizeA) maxX++;
        if (minY > 1) minY--;
        if (maxY < size1) maxY++;

        for (int i = minX; i <= maxX; i++)
            for (int j = minY; j <= maxY; j++)
                if (field[i - 1][j - 1] != Mark.FOG) return false;
        return true;
    }

    private boolean checkLocation(Coordinate begin, Coordinate end) {
        int lengthX = begin.getX() - end.getX();
        int lengthY = begin.getY() - end.getY();

        if (Math.max(begin.getX(), end.getX()) > sizeA ||
                Math.max(begin.getY(), end.getY()) > size1) return false;
        return lengthX * lengthY == 0;
    }
}
