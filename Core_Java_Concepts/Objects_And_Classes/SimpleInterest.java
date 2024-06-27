package Objects_And_Classes;

/**
 * The type Simple interest.
 */
public class SimpleInterest
{
	// Attributes of a SimpleInterest Object.
	private double principal, rate, time;

	/**
	 * Sets the principal to the given amount.
	 *
	 * @param principal The new principal.
	 */
	public void setPrincipal(double principal)
	{
		this.principal = principal;
	}

	/**
	 * Sets rate to the given rate.
	 *
	 * @param rate The new rate.
	 */
	public void setRate(double rate)
	{
		this.rate = rate;
	}

	/**
	 * Sets time to the give time.
	 *
	 * @param time The new time.
	 */
	public void setTime(double time)
	{
		this.time = time;
	}

	/**
	 * Returns the  principal.
	 *
	 * @return The principal
	 */
	public double getPrincipal()
	{
		return (this.principal);
	}

	/**
	 * Returns the rate.
	 *
	 * @return The rate.
	 */
	public double getRate()
	{
		return (this.rate);
	}

	/**
	 * Returns the time.
	 *
	 * @return The time.
	 */
	public double getTime()
	{
		return (this.time);
	}

	/**
	 * Calculates the Simple interest.
	 *
	 * @return The Simple Interest.
	 */
	public  double getSimpleInterest()
	{
		return (principal * rate * time);
	}

	public static void main(String[] args)
	{
		// creates aSimpleInterest Object.
		SimpleInterest simpleInterest = new SimpleInterest();

		// Sets the principal, rate and time.
		simpleInterest.setPrincipal(5500.34);
		simpleInterest.setRate(0.08);
		simpleInterest.setTime(2.0);

		// Displays the Simple Interest.
		System.out.printf("\nThe Simple Interest is: %.4f\n", simpleInterest.getSimpleInterest());
	}
}
