package Abstract_Classes_And_Interfaces.Ticket;

public class AdvanceTicket extends Ticket
{
    /**
     * Instantiates a new AdvanceTicket
     *
     * @param daysInAdvance Indicates the number of days in advance that the ticket is being purchased
     */
    public AdvanceTicket(int daysInAdvance)
    {
        if (daysInAdvance >= 10)
            this.price = 30.0;
        else
            this.price = 40.0;
    }

    /**
     * This returns the serial number of the AdvanceTicket.
     *
     * @return The serial Number of the AdvanceTicket .
     */
    @Override
    public int getSerialNumber()
    {
        return this.serialNumber;
    }

    /**
     * This returns the price of the AdvanceTicket.
     *
     * @return The price of the AdvanceTicket.
     */
    @Override
    public double getPrice()
    {
        return this.price;
    }
}
