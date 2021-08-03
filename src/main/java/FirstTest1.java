import test.ship.StarShip;

public class FirstTest1 {

    public static void main(String[] args) {
        //создаю экземпляр класса корабля
        StarShip ship = new StarShip();

        //задаю конкретному кораблю конкретное свойство
        ship.shipHeight = 253.25;
    }
    public static void displayHeight(StarShip ourship) {
        System.out.println("Высота корабля составляет : "+ourship.shipHeight);
    }

}