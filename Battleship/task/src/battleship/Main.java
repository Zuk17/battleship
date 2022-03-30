package battleship;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        // Write your code here
        Field field = new Field();
        field.printField();

        ArrayList<Ship> ListShips = new ArrayList<>();
        addNewShips(ListShips);

for (Ship a : ListShips)
    System.out.println(a.printName());
    }

//  Enter the coordinates of the Aircraft Carrier (5 cells):
//  Enter the coordinates of the Battleship (4 cells):
//  Enter the coordinates of the Submarine (3 cells):
//  Error! Wrong length of the Submarine! Try again:
//  Error! Wrong ship location! Try again:
//  Enter the coordinates of the Destroyer (2 cells):
//  Error! You placed it too close to another one. Try again:

    static void addNewShips(ArrayList<Ship> ListShips) {
        ListShips.add(new Ship("Aircraft Carrier", 5));
        ListShips.add(new Ship("Battleship", 4));
        ListShips.add(new Ship("Submarine", 3));
        ListShips.add(new Ship("Cruiser", 3));
        ListShips.add(new Ship("Destroyer", 2));
    }

}
