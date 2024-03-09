package Abstract_Classes_And_Interfaces.NewsPaper;

public abstract class NewsPaperSubscription
{
    // NewsPaperSubscription Attributes.
    private String name;
    protected String address;
    protected double rate;

    public  NewsPaperSubscription(String name, String address)
    {
        this.name = name;
        this.address =  address;
    }

    /**
     * Sets the name of a subscriber to the given value.
     *
     * @param name The new name of the subscriber.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * This returns the name of the subscriber.
     *
     * @return The subscriber's name.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * This returns the address of the subscriber.
     *
     * @return The subscriber's address.
     */
    public String getAddress()
    {
        return this.address;
    }

    /**
     * This returns the rate of the subscription.
     *
     * @return The subscription rate.
     */
    public double getRate()
    {
        return this.rate;
    }

    /**
     * Sets the subscriber address to the given value.
     *
     * @param address The subscriber's address
     */
    public abstract void setAddress(String address);
}
