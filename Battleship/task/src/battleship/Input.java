package battleship;

import java.util.Scanner;

public class Input {

    Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    //read single coordinate
    public Coordinate readCoord() {
        String inputString = scanner.next().toUpperCase();
        if (inputString.matches("^[A-Z]+\\d+")) {

            System.out.println("!" + inputString + "!");

            //Буквенная часть
            String coordX = inputString.split("[A-Z]+").toString();
            String coordY = inputString.split("\\d+").toString();

            System.out.println("X = " + coordX + "\t\tY = " + coordY);

            return new Coordinate(coordX, coordY);
        } else {
            System.out.println("ERROR!!!!!!!!!!!\tWrong number or format of elements.!!!!!!!!!!!\tERROR\n");
            return null;
        }
    }
}
