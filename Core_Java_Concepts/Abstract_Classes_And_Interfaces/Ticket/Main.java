package Abstract_Classes_And_Interfaces.Ticket;

/*
    This is a program that creates Objects of different types of Tickets, adds them to a TicketOrder list and then displays
    information about each Ticket and also displays the total number of Tickets in the TicketOrder list and the total price
    of all the Tickets.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates a TicketOrder Object.
        TicketOrder ticketOrder = new TicketOrder();

        // Creates different types of Ticket Objects.
        ComplimentaryTicket complimentaryTicket = new ComplimentaryTicket();
        WalkUpTicket walkUpTicket = new WalkUpTicket();
        AdvanceTicket advanceTicket = new AdvanceTicket(5);
        StudentAdvanceTicket studentAdvanceTicket = new StudentAdvanceTicket(15);

        // Add the Tickets to the ticketOrder's ticketList.
        ticketOrder.add(complimentaryTicket);
        ticketOrder.add(walkUpTicket);
        ticketOrder.add(advanceTicket);
        ticketOrder.add(studentAdvanceTicket);

        // Displays information about all the Ticket in the Ticket list.
        System.out.println("\n\t\tTicket Information");
        for (Ticket ticket: ticketOrder.ticketList)
        {
            System.out.print("Ticket Type: " + ticket.getClass().getSimpleName());
            System.out.println(ticket.toString());
            System.out.println();
        }

        // Displays the total number of Tickets and the price of all the Tickets in the list.
        System.out.println(ticketOrder.toString());
    }
}
