package Objects_And_Classes;

/**
 * The type Temperature.
 */
public class Temperature {
    // Attribute holding the temperature in Fahrenheit.
    private double fahrenheitTemperature;

    /**
     * Instantiates a new Temperature Object with a given temperature in Fahrenheit.
     *
     * @param fahrenheitTemperature The temperature of the Object in Fahrenheit.
     */
    public Temperature(double fahrenheitTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

    /**
     * Gets Fahrenheit temperature.
     *
     * @return The Fahrenheit temperature of the Object.
     */
    public double getFahrenheitTemperature() {
        return this.fahrenheitTemperature;
    }

    /**
     * Sets the temperature of the Object to the given Fahrenheit temperature.
     *
     * @param fahrenheitTemperature The new Fahrenheit temperature.
     */
    public void setFahrenheitTemperature(double fahrenheitTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

    /**
     * Gets the kelvin temperature equivalent.
     *
     * @return The kelvin temperature equivalent of the Temperature Object.
     */
    public double getKelvinTemperature() {
        return ((5 / 9.0) * this.fahrenheitTemperature - 32) + 273;
    }

    /**
     * Gets the Celsius temperature equivalent.
     *
     * @return The Celsius temperature equivalent of the Temperature Object.
     */
    public double getCelsius() {
        return (5 / 9) * (this.fahrenheitTemperature - 32);
    }
}
