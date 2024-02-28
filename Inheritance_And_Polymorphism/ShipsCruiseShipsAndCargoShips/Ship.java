package Inheritance_And_Polymorphism.ShipsCruiseShipsAndCargoShips;

public class Ship
{
    // Attributes a Ship.
    private String shipName, yearBuilt;

    /**
     * Instantiates a new Ship.
     *
     * @param shipName The Ship's name
     * @param yearBuilt The year the Ship was built.
     */
    public Ship(String shipName, String yearBuilt)
    {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    /**
     * Gets the Ship's name.
     *
     * @return The Ship's name.
     */
    public String getShipName()
    {
        return this.shipName;
    }

    /**
     * Sets the Ship's name to the given value.
     *
     * @param shipName The new Ship's name.
     */
    public void setShipName(String shipName)
    {
        this.shipName = shipName;
    }

    /**
     * Gets the year the Ship was built.
     *
     * @return The year the Ship was built.
     */
    public String getYearBuilt()
    {
        return this.yearBuilt;
    }

    /**
     * Sets the year the ship was built to the given value.
     *
     * @param yearBuilt The new year.
     */
    public void setYearBuilt(String yearBuilt)
    {
        this.yearBuilt = yearBuilt;
    }

    /**
     * Gives a description of the Ship Object.
     * @return A String describing the Ship Object.
     */
    @Override
    public String toString()
    {
        return "Ship Name: " + this.getShipName() + "\n" + "Year Built: " +  this.getYearBuilt() + "\n";
    }
}
