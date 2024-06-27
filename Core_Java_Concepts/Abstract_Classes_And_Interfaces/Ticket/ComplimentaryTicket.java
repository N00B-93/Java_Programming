package Abstract_Classes_And_Interfaces.Ticket;

public class ComplimentaryTicket extends FixedPriceTicket
{
    /**
     * Instantiates a ComplimentaryTicket.
     */
    public ComplimentaryTicket()
    {
        super(0);
    }

    /**
     * This returns the serial number of the ComplimentaryTicket.
     * @return The serial Number of the Complimentary Ticket.
     */
    @Override
    public int getSerialNumber()
    {
        return this.serialNumber;
    }

    /**
     * This returns the price of the ComplimentaryTicket.
     * @return The price of the Complimentary Ticket.
     */
    @Override
    public double getPrice()
    {
        return this.price;
    }
}
