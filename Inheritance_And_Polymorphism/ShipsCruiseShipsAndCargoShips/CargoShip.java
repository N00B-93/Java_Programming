package Inheritance_And_Polymorphism.ShipsCruiseShipsAndCargoShips;

public class CargoShip extends Ship
{
    // Capacity of the CargoShip.
    private int cargoCapacity;

    /**
     * Instantiates a new Cargo ship.
     *
     * @param shipName The Cargo Ship's name.
     * @param yearBuilt The year built.
     * @param cargoCapacity The cargo capacity.
     */
    public CargoShip(String shipName, String yearBuilt, int cargoCapacity)
    {
        super(shipName, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * Sets cargo capacity to the given value.
     *
     * @param cargoCapacity The new cargo capacity
     */
    public void setCargoCapacity(int cargoCapacity)
    {
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * Gets the cargo capacity.
     *
     * @return The cargo capacity
     */
    public int getCargoCapacity()
    {
        return this.cargoCapacity;
    }

    /**
     * Returns a String description of the Cargo Ship.
     *
     * @return The description of the Cargo Ship.
     */
    @Override
    public String toString()
    {
        return super.toString() + "Cargo Capacity: " + this.getCargoCapacity() + " tonnes" + "\n";
    }
}
