package battleship;

public class Coordinate {
    private int coordX;
    private int coordY;

    public Coordinate(String inputStr) {
        parseInputStr(inputStr);
    }

    private void parseInputStr(String inputStr) {

//        System.out.println("!" + inputStr + "!");

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < inputStr.length(); i++) {
            if (Character.isDigit(inputStr.charAt(i))) {
                b.append(inputStr.charAt(i));
            } else a.append(inputStr.charAt(i));
        }
        a.reverse();

        coordX = 0;
        for (int i = 0; i < a.length(); i++) {
            int number = a.charAt(i) - 'A' + 1;
            coordX += number * (int) Math.pow(26, i);
        }
        coordY = Integer.parseInt(b.toString());
//        System.out.println("X = " + coordX + "\t\tY = " + coordY);
    }

    public String getCoord() {
        return "[ " + coordX + ", " + coordY + " ]";
    }

    public int getX() {
        return coordX;
    }

    public int getY() {
        return coordY;
    }

}
