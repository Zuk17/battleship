package battleship;

public class Ship {
    private final String type;
    private final int length;
    private Coordinate begin;
    private Coordinate end;
    private Boolean[] alive;

    public Ship(String name, int length) {
        this.type = name;
        this.length = length;
    }

    public String printName() {
        return type + " (" + length + " cells):";
    }

    public boolean checkLength(Coordinate begin, Coordinate end) {
        int lengthX = Math.abs(begin.getX() - end.getX());
        int lengthY = Math.abs(begin.getY() - end.getY());
        return lengthX * lengthY == 0 && (lengthX == length - 1  || lengthY == length - 1);
    }

    public void setCoords(Coordinate begin, Coordinate end) {
        this.begin = begin;
        this.end = end;
        alive = new Boolean[length];
        for (int i = 0; i < length; i++) alive[i] = true;
    }
}
