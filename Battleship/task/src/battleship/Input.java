package battleship;

import java.util.Scanner;

public class Input {

    Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public boolean getCoordShip(int[][] coord) {
        String[] inputString = scanner.nextLine().split(" ");
        try {
            coord[0][1] = inputString[0].charAt(1);
            coord[1][1] = inputString[1].charAt(1);

            coord[0][0] = inputString[0].charAt(0); //regex перевести букву в цифру
            coord[1][0] = inputString[1].charAt(0); //regex перевести букву в цифру

            return true;

        } catch (Exception e) {
            System.out.println("ERROR!!!!!!!!!!!\tWrong number or format of elements.!!!!!!!!!!!\tERROR\n");
            return false;
        }
    }
}
