package battleship;

public class Coordinate {
    private String x;
    private String y;

    public Coordinate(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public String getCoord() {
        return "[ " + x + ", " + y + " ]";
    }
}
