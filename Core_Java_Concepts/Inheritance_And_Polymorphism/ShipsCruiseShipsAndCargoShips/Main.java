package Inheritance_And_Polymorphism.ShipsCruiseShipsAndCargoShips;

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Ship, CargoShip and CruiseShip Object.
        Ship ship = new Ship("Demeter", "1656");
        CargoShip cargoShip = new CargoShip("Orion", "2017", 100);
        CruiseShip cruiseShip = new CruiseShip("Titanic", "1934", 5000);

        // Creates an array of Ship Objects.
        Ship[] ships = {ship, cruiseShip, cargoShip};

        // Calls the toString method of each Object.
        for (int i = 0; i < ships.length; ++i)
            System.out.println(ships[i].toString());
    }
}
