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
                int[][] coord = new int[2][2];

                // Прочитать данные (если не "буквацифра буквацифра" - false)
                if (!input.getCoordShip(coord)) exit = false;

                // Добавить корабль на поле (если не получается - false)
                else if (!field.addShipToField(a, coord)) exit = false;

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
