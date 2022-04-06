package battleship;

public enum ShipTypes {

    AIRCRAFT("Aircraft Carrier", 5),
    BATTLESHIP("Battleship", 4),
    SUBMARINE("Submarine", 3),
    CRUISER("Cruiser", 3),
    DESTROYER("Destroyer", 2);

    private final String name;
    private final int length;

    ShipTypes(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String toString() {
        return String.valueOf(name);
    }

    int lengthOf() {
        return length;
    }
}
