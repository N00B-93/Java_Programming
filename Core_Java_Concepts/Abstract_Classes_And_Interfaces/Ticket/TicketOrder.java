package Abstract_Classes_And_Interfaces.Ticket;

import java.util.ArrayList;

public class TicketOrder
{
    // A list of different Tickets.
    public ArrayList<Ticket> ticketList = new ArrayList<>();

    //No-arg constructor.
    public TicketOrder(){}

    /**
     * This adds a Ticket to the ticket list.
     *
     * @param ticket The Ticket to be added to the list.
     */
    public void add(Ticket ticket)
    {
        this.ticketList.add(ticket);
    }

    /**
     * This returns the total price of all Tickets in the ticket list.
     *
     * @return The price of all Tickets in the ticket list.
     */
    public double totalPrice()
    {
        double totalPrice = 0.0;

        for (Ticket ticket: this.ticketList)
            totalPrice += ticket.getPrice();
        return totalPrice;
    }

    /**
     * This returns a String describing a TicketOrder.
     *
     * @return String describing a TicketOrder.
     */
    public String toString()
    {
        return "Total Number Of Tickets: " + this.ticketList.size() + "\n" +
                "Total Price Of Tickets: $ " + this.totalPrice();
    }
}
