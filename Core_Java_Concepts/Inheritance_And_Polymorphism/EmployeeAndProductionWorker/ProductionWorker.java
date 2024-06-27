package Inheritance_And_Polymorphism.EmployeeAndProductionWorker;

public class ProductionWorker extends Employee
{
    // Attributes of a ProductionWorker.
    int shift;
    double hourlyRate;

    /**
     * Instantiates a new Production worker.
     *
     * @param name The ProductionWorker's name.
     * @param employeeID The ProductionWorker's id.
     * @param shift The ProductionWorker's shift.
     * @param hourlyRate The ProductionWorker's hourly rate
     */
    public ProductionWorker(String name, String employeeID, int shift, double hourlyRate)
    {
        super(name, employeeID);
        this.shift = shift;
        this.hourlyRate = hourlyRate;
    }

    /**
     * Gets the ProductionWorker's shift.
     *
     * @return "Day" if the shift is 1, else "Night".
     */
    public String getShift()
    {
        if (this.shift == 1) return "Day";
        return "Night";
    }

    /**
     * Sets shift to the given value.
     *
     * @param newShift The new shift.
     */
    public void setShift(String newShift)
    {
        if (newShift.equalsIgnoreCase("day"))
            this.shift = 1;
        else if(newShift.equalsIgnoreCase("night"))
            this.shift = 2;
    }

    /**
     * Gets the hourly rate of the ProductionWorker.
     *
     * @return The hourly rate.
     */
    public double getHourlyRate()
    {
        return this.hourlyRate;
    }

    /**
     * Sets hourly rat to the given value.
     *
     * @param newRate The ProductionWorker's new hourly rate.
     */
    public void setHourlyRate(double newRate)
    {
        this.hourlyRate = newRate;
    }

    /**
     * A String describing the ProductionWorker Object.
     *
     * @return Description of the ProductionWorker Object.
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nShift: " + this.getShift() + "\n" + "Hourly Rate: $ " + this.getHourlyRate();
    }
}
