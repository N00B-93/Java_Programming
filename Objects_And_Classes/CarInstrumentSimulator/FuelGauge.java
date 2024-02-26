package Objects_And_Classes.CarInstrumentSimulator;

public class FuelGauge
{
    // FuelGauge amountOfFuel attribute.
    private double amountOfFuel;

    /**
     * Instantiates a new Fuel gauge Object.
     *
     * @param amountOfFuel The initial amount of fuel.
     */
    public FuelGauge(double amountOfFuel)
    {
        this.amountOfFuel = amountOfFuel;
    }

    /**
     * Gets the amount of fuel currently available.
     *
     * @return The amount of fuel available.
     */
    public double getAmountOfFuel()
    {
        return this.amountOfFuel;
    }

    /**
     * Adds a gallon of fuel to the current available amount of fuel if the amount of fuel is less than
     * 15 gallons.
     */
    public void addFuel()
    {
        if (this.amountOfFuel < 15)
            this.amountOfFuel++;
    }

    /**
     * Removes a gallon of fuel from the current available amount of fuel if the amount of fuel is greater than
     * 0 gallons.
     */
    public void consumeFuel()
    {
        if (this.amountOfFuel > 0)
            this.amountOfFuel--;
    }
}
