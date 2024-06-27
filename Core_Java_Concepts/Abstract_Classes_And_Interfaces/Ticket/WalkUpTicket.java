package Abstract_Classes_And_Interfaces.Ticket;

public class WalkUpTicket extends FixedPriceTicket
{
    /**
     * Instantiates a WalkUpTicket.
     *
     * @param price The price of the Ticket.
     */
    public WalkUpTicket()
    {
        super(50);
    }

    /**
     * This returns the serial number of the WalkUpTicket.
     * @return The serial Number of the WalkUpTicket .
     */
    @Override
    public int getSerialNumber()
    {
        return this.serialNumber;
    }

    /**
     * This returns the price of the WalkUpTicket.
     * @return The price of the WalkUpTicket.
     */
    @Override
    public double getPrice()
    {
        return this.price;
    }
}
