package battleship;

public class Ship {
    String type;
    int length;
    Coordinate begin;
    Coordinate end;
    Boolean[] alive;

    public Ship(String name, int length) {
        this.type = name;
        this.length = length;
    }

    public String printName(){
        return type + " (" + length + " cells):";
    }

}
