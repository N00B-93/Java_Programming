package Inheritance_And_Polymorphism.ShipsCruiseShipsAndCargoShips;

public class CruiseShip extends Ship
{
    // Attribute of a CruiseShip.
    int maximumNumberOfPassengers;

    /**
     * Instantiates a new Cruise Ship.
     *
     * @param shipName The Cruise Ship's name.
     * @param yearBuilt The year built.
     * @param maximumNumberOfPassengers The maximum number of passengers the Cruise Ship can take.
     */
    public CruiseShip(String shipName, String yearBuilt, int maximumNumberOfPassengers)
    {
        super(shipName, yearBuilt);
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
    }

    /**
     * Gets maximum number of passengers.
     *
     * @return The maximum number of passengers.
     */
    public int getMaximumNumberOfPassengers()
    {
        return maximumNumberOfPassengers;
    }

    /**
     * Sets maximum number of passengers to the given value.
     *
     * @param maximumNumberOfPassengers The new maximum number of passengers.
     */
    public void setMaximumNumberOfPassengers(int maximumNumberOfPassengers)
    {
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
    }

    /**
     * Gives a description of the Cruise Ship Object.
     *
     * @return A description of the Cruise Ship Object.
     */
    @Override
    public String toString()
    {
        return super.toString() + "Maximum Number Of Passengers: " + this.getMaximumNumberOfPassengers() + "\n";
    }
}
