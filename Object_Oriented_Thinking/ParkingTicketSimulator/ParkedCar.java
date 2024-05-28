package Object_Oriented_Thinking.ParkingTicketSimulator;

public class ParkedCar
{
    private String make, model, colour, licenseNumber;

    private int numberOfMinutesParked, minutesPurchased;

    /**
     * Instantiates a new ParkedCar Object.
     *
     * @param make The ParkedCar's make.
     * @param numberOfMinutesParked The number of minutes the ParkedCar has been parked.
     * @param licenseNumber The ParkedCar's license number.
     * @param colour The ParkedCar's colour.
     * @param model The ParkedCar's model.
     * @param minutesPurchased The parking time purchased by the driver of the ParkedCar.
     */
    public ParkedCar(String make, int numberOfMinutesParked, String licenseNumber, String colour, String model, int minutesPurchased)
    {
        this.make = make;
        this.numberOfMinutesParked = numberOfMinutesParked;
        this.licenseNumber = licenseNumber;
        this.colour = colour;
        this.model = model;
        this.minutesPurchased = minutesPurchased;
    }

    /**
     * This returns the make of a ParkedCar.
     *
     * @return A ParkedCar's make.
     */
    public String getMake()
    {
        return make;
    }

    /**
     * This returns the number of minutes a ParkedCar has been parked.
     *
     * @return The number of minutes a ParkedCar has been parked.
     */
    public int getNumberOfMinutesParked()
    {
        return this.numberOfMinutesParked;
    }

    /**
     * This returns the license number of a ParkedCar.
     *
     * @return The license number of a ParkedCar.
     */
    public String getLicenseNumber()
    {
        return this.licenseNumber;
    }

    /**
     * This returns the colour of a ParkedCar.
     *
     * @return The colour of a ParkedCar.
     */
    public String getColour()
    {
        return this.colour;
    }

    /**
     * This returns the model of a ParkedCar.
     *
     * @return The model of a ParkedCar.
     */
    public String getModel()
    {
        return this.model;
    }

    /**
     * This returns the number of minutes purchased by the driver of a ParkedCar.
     *
     * @return The number of minutes purchased by the driver of a ParkedCar.
     */
    public int getMinutesPurchased()
    {
        return this.minutesPurchased;
    }
}
