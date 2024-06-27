package Abstract_Classes_And_Interfaces.Ticket;

public abstract class FixedPriceTicket extends Ticket
{
    /**
     * Instantiates a FixedPriceTicket.
     *
     * @param price The price of the Ticket.
     */
    public FixedPriceTicket(double price)
    {
        super();
        this.price = price;
    }
}
