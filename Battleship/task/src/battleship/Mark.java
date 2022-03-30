package battleship;

public enum Mark {
    FOG('~'),
    SHIP('o'),
    HIT('X'),
    MISS('M');

    private char appearence;

    Mark(char c) {
        this.appearence = c;
    }

    String valueOf() { return String.valueOf(appearence); }
}
