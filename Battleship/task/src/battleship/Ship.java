package battleship;

public class Ship {
    String type;
    int length;
    Boolean[] alive;

    public Ship(String name, int length) {
        this.type = name;
        this.length = length;
    }

    public String printName(){
        return type + " (" + length + " cells):";
    }

    //        length = coord[0][1] - coord[1][1];
}
