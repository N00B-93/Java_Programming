package Abstract_Classes_And_Interfaces.Ticket;

import java.util.Random;
import java.util.ArrayList;

public abstract class Ticket
{
    // The serial number of a Ticket.
    protected int serialNumber;

    // The price of a Ticket.
    public double price;

    // ArrayList containing previously assigned serial numbers.
    private ArrayList<Integer> assignedSerialNumbers = new ArrayList<>();

    /**
     * No-arg constructor that instantiates a new Ticket Object.
     */
    public Ticket()
    {
        Random random = new Random();

        int generatedSerialNumber = random.nextInt(100, 999);

        while (assignedSerialNumbers.contains(generatedSerialNumber))
        {
             generatedSerialNumber = random.nextInt(100, 999);
        }

        this.serialNumber = generatedSerialNumber;

        assignedSerialNumbers.add(this.serialNumber);
    }

    // Abstract method to return the serial number of a Ticket.
    public abstract int getSerialNumber();

    // Abstract method to return the price of a Ticket.
    public abstract double getPrice();

    /**
     * This returns a description of a Ticket Object.
     *
     * @return A String that describes an instance of a Ticket.
     */
    @Override
    public String toString()
    {
        return "\nSerial Number: " + this.serialNumber + "\n" + "Price: $ " + this.price;
    }
}
