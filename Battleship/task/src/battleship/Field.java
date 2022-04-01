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

   public void addShip(String name, int length){
        ListShips.add (new Ship(name, length));
   }

   // Print field
    public String printField() {
        StringBuilder output = new StringBuilder(columns).append("\n");
        for (int i = 0; i < sizeA; i++)
            output.append(rows[i]).append(" ").append(str(field[i])).append("\n");
        return output.toString();
    }

    // sub method for printing field
    private String str (Mark[] a) {
        StringBuilder output = new StringBuilder();
        for (Mark b : a)
            output.append(b.valueOf()).append(" ");
        return output.toString();
    }

    public boolean addShipToField(Ship a,Coordinate begin,Coordinate end) {

        System.out.println("Trying add ship to field");

//        System.out.println("Error! Wrong length of the " + a.printName() + "! Try again:\n");
//
//        System.out.println("Error! Wrong ship location! Try again:\n");
//
//        System.out.println("Error! You placed it too close to another one. Try again:\n");

        System.out.println("Ship " + a.printName() + " not added.");

        return false;
    }
}
