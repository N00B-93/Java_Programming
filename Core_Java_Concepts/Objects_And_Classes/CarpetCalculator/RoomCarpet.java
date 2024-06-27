package Objects_And_Classes.CarpetCalculator;

public class RoomCarpet
{
    // The attributes of a RoomCarpet Object.
    RoomDimension size;
    double carpetCost;

    /**
     * Instantiates a new RoomCarpet Object.
     *
     * @param size The size of the room.
     * @param carpetCost The carpet cost.
     */
    public RoomCarpet(RoomDimension size, double carpetCost)
    {
        this.size = size;
        this.carpetCost = carpetCost;
    }

    /**
     * Gets total cost it takes to procure carpet for a room of given dimension.
     *
     * @return The total cost
     */
    public double getTotalCost()
    {
        return this.carpetCost * this.size.getArea();
    }

    /**
     * Returns The String representation of a RoomCarpet Object.
     * @return  String representation of a RoomCarpet Object.
     */
    public String toString()
    {
        return "\nRoom Dimension: " + this.size.getArea() + "\n" + "Total Cost: $ " + this.getTotalCost();
    }
}
