package battleship;

public enum Mark {
    FOG('~'),
    SHIP('o'),
    HIT('X'),
    MISS('M');

    private final char appearance;

    Mark(char c) {
        this.appearance = c;
    }

    String valueOf() {
        return String.valueOf(appearance);
    }
}

