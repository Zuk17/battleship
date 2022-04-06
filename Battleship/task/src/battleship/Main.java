package battleship;

public class Main {

    public static void main(String[] args) {
        // Write your code here

        // Создание класса для чтения входящих данных
        Input input = new Input();

        // Создание поля боя
        Field field = new Field(10, 10);
        // Установка кораблей на поле
        addShips(input, field);

        startGame(input, field);
    }

    private static void startGame(Input input, Field field) {
        System.out.println("The game starts!\n\n" + field.printField(Mark.FOG) + "\nTake a shot!\n");
        while (field.isAlive()) {
            System.out.println(field.hit(input.readCoord()));
            System.out.println(field.printField(Mark.FOG));
        }

        System.out.println(field.printField(Mark.SHIP));
    }

    private static void addShips(Input input, Field field) {
        for (Ship ship : field.ListShips) {
            System.out.println("\n" + field.printField(Mark.SHIP));
            System.out.println(ship.toString() + ":\n");
            while (!ship.isAlive()) {
                System.out.println(field.addShipToField(ship, new Coordinates(input.readCoordShip())));
            }
        }
        System.out.println(field.printField(Mark.SHIP));
    }
}
