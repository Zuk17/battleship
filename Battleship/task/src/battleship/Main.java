package battleship;

public class Main {


    public static void main(String[] args) {
        // Write your code here

        // Создание класса для чтоения входящих данных
        Input input = new Input();

        // Создание поля боя
        Field field = new Field();
        System.out.println(field.printField());

        // Создание кораблей
        addNewShips(field);

        // Установка кораблей на поле
        for (Ship a : field.ListShips) {
            boolean exit = true;
            do {
                System.out.println(a.printName());

                // Прочитать два набора координат (если не получилось - null)
                System.out.println("Reading coordinates successful.");
                Coordinate begin = input.readCoord();
                Coordinate end = input.readCoord();
                System.out.println("Begin : " + begin.getCoord() + "\tEnd : " + end.getCoord() + "\n");

                // Добавить корабль на поле (если не получается - false)
                if (begin == null || end == null) {
                    exit = !field.addShipToField(a, begin, end);
                }

            } while (exit);
        }
    }

    static void addNewShips(Field field) {
        field.addShip("Aircraft Carrier", 5);
        field.addShip("Battleship", 4);
        field.addShip("Submarine", 3);
        field.addShip("Cruiser", 3);
        field.addShip("Destroyer", 2);
    }

}
