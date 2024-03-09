package Abstract_Classes_And_Interfaces.NewsPaper;

/**
 * The type PhysicalNewsPaper subscription.
 */
public class PhysicalNewsPaperSubscription extends NewsPaperSubscription
{
    /**
     * Instantiates a new PhysicalNewsPaper subscription Object.
     *
     * @param name The name of the subscriber.
     */
    public PhysicalNewsPaperSubscription(String name)
    {
        super(name);
    }

    /**
     * Sets the address to the given value if it contains at least one digit. else, displays an error message
     * and sets the rate to 0.
     * @param address The subscriber's address
     */
    @Override
    public void setAddress(String address)
    {
        if (countDigits(address) >= 1)
            this.address = address;
        else
        {
            System.out.println("\nInvalid Address!\nYour Address should contain at least one digit.");
            this.rate = 0.0;
        }
    }

    /**
     * Count digits in an address.
     *
     * @param address The address to be processed.
     * @return The number of digits in the address.
     */
    public static int countDigits(String address)
    {
        int digitCounter = 0;

        for (int i = 0; i < address.length(); i++)
        {
            if (Character.isLetter(address.charAt(i)))
                digitCounter++;
        }
        return digitCounter;
    }
}
