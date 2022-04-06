package battleship;

import java.util.ArrayList;

public class Ship {
    private final ShipTypes type;
    private final int length;
    private ArrayList<Coordinate> coordAlive;

    public Ship(ShipTypes name, int length) {
        this.type = name;
        this.length = length;
        coordAlive = new ArrayList<>();
    }

    public String toString() {
        return type + " (" + length + " cells)";
    }

    public boolean checkLength(Coordinates coord) {
        return (coord.getXLength() == length - 1 || coord.getYLength() == length - 1);
    }

    public void setCoords(Coordinates coords) {
        if (coords.getXLength() == 0)
            for (int i = coords.minY - 1; i < coords.maxY; i++)
                coordAlive.add(new Coordinate(coords.minX -1, i));
        else
            for (int i = coords.minX - 1; i < coords.maxX; i++)
                coordAlive.add(new Coordinate(i, coords.minY -1));
    }

    public boolean shipHit(Coordinate hit) {
        return coordAlive.remove(hit);
    }

    public boolean isAlive() {
        return coordAlive.isEmpty();
    }

    public ArrayList<Coordinate> getCoordAlive() {
        return coordAlive;
    }
}

