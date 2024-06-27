package Abstract_Classes_And_Interfaces.Ticket;

public class StudentAdvanceTicket extends AdvanceTicket
{
    /**
     * Instantiates a new AdvanceTicket
     *
     * @param daysInAdvance Indicates the number of days in advance that the ticket is being purchased
     */
    public StudentAdvanceTicket(int daysInAdvance)
    {
        super(daysInAdvance);
    }

    /**
     * This returns the price of the StudentAdvanceTicket.
     *
     * @return The price of the StudentAdvanceTicket.
     */
    @Override
    public double getPrice()
    {
        return this.price / 2.0;
    }

    /**
     * This returns a String describing the StudentAdvanceTicket.
     *
     * @return A String describing the StudentAdvanceTicket.
     */
    @Override
    public String toString()
    {
        return super.toString() + " (Student)";
    }
}
