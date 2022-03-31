package battleship;

public class Ship {
    String type;
    int length;
    int[][] coord;
    Boolean[] alive;

    public Ship(String name, int length) {
        this.type = name;
        this.length = length;
    }

    public String printName(){
        return type + " (" + length + " cells):";
    }

}
