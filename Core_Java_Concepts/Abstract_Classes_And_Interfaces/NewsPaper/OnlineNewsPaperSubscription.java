package Abstract_Classes_And_Interfaces.NewsPaper;

/**
 * The type OnlineNewsPaper subscription.
 */
public class OnlineNewsPaperSubscription extends NewsPaperSubscription
{
    /**
     * Instantiates a new OnlineNewsPaper subscription Object.
     *
     * @param name The name of the subscriber.
     */
    public OnlineNewsPaperSubscription(String name)
    {
        super(name);
    }

    /**
     * Sets the subscriber's address to the given value and also sets the rate to $ 9.00 if the address contains an '@'
     * character, else displays an error message and sets the rate to $ 0.0.
     * @param address The subscriber's address
     */
    @Override
    public void setAddress(String address)
    {
        if (address.contains("@"))
        {
            this.address = address;
            this.rate = 9.0;
        }
        else
        {
            System.out.println("\nInvalid Address!\nYour Address must contain an '@' sign.");
            this.rate = 0.0;
        }
    }
}
