package Objects_And_Classes;

class SwimmingPool
{
	// Attributes of a SwimmingPool.
	protected double length, width, depth, fillingRate, drainingRate, waterLevel;

	/**
	 * Instantiates a new SwimmingPool.
	 * @param length The length of the SwimmingPool in feet.
	 * @param width The width of the SwimmingPool in feet.
	 * @param depth The depth of the SwimmingPool in feet.
	 * @param fillingRate The rate at which the SwimmingPool is filled with water.
	 * @param drainingRate The rate at which water can be drained from the SwimmingPool.
	 * @param waterLevel The quantity of water in the SwimmingPool in cubic feet.
	 */
	public SwimmingPool(double length, double width, double depth, double fillingRate, double drainingRate, double waterLevel)
	{
		this.length = length;
		this.width = width;
		this.depth = depth;
		this.fillingRate = fillingRate;
		this.drainingRate = drainingRate;
		this.waterLevel = waterLevel;
	}

	/**
	 * This returns the quantity of water needed to fill a SwimmingPool.
	 * 
	 * @return The Quantity of water needed to fill the SwimmiingPool.
	 */
	public double waterToFillPool()
	{
		if (waterLevel == 0)
			return this.depth * this.length * this.width;
		return (this.depth * this.length * this.width) - this.waterLevel;
	}

	/**
	 * This determines the time taken to fill the SwimmingPool with water.
	 * 
	 * @return The time taken to fill the SwimmingPool with water.
	 */
	public double timeToFillPool()
	{
		return this.waterToFillPool() / this.fillingRate;
	}

	/**
	 * This determines the time taken to drain a SwimmingPool of water.
	 * 
	 * @return The time taken to drain the SwimmingPool.
	 */
	public double timeToDrainPool()
	{
		return this.waterLevel / this.drainingRate;
	}

		/**
	 * This adds water to the SwimmingPool for a given amount of time in seconds.
	 * 
	 * @param time The time to add water to the SwimmingPool.
	 * 
	 * @return true if water is added to the SwimmingPool, else false.
	 */
	public boolean addWater(double time)
	{
		if (this.waterLevel == this.waterToFillPool())
		{
			System.out.println("\nSwimmingPool is already filled with water!\n");
			return false;
		}
		else if (time > this.timeToFillPool())
		{
			System.out.printf("\n%.2f seconds is too high, SwimmingPool will overflow\nUse a lesser time.", time);
			return false;
		}
		else if (time <= this.timeToFillPool())
		{
			System.out.printf("\n%.2f cubic feet of water added to SwimmingPool!\n", this.fillingRate * time);
			this.waterLevel += this.fillingRate * time;
			return true;
		}
		return false;
	}

	/**
	 * This drains water from the SwimmingPool for a given amount of time in seconds.
	 * 
	 * @param time The time to drain water from the SwimmingPool.
	 * 
	 * @return true if water is drained from the SwimmingPool, else false.
	 */
	public boolean drainWater(double time)
	{
		if (this.waterLevel == 0)
		{
			System.out.println("\nSwimmingPool is Empty!");
			return false;
		}
		else if (time <= this.timeToDrainPool())
		{
			System.out.printf("\n%.2f cubic feet of water drained from the SwimmingPool!\n", this.drainingRate * time);
			this.waterLevel -= this.drainingRate * time;
			return true;
		}
		System.out.printf("\n%.2f seconds is too high, enter a time <= %.2f seconds.\n", time, this.timeToDrainPool());
		return false;
	}
	public static void main(String[] args)
	{
        // Create two new SwimmingPool objects with dimensions and rates
        SwimmingPool pool1 = new SwimmingPool(20, 10, 5, 10, 5, 0);
		SwimmingPool pool2 = new SwimmingPool(15.3, 21.5, 10.6, 7.5, 4.7, 72.3);

        // Test waterToFillPool() method
        double waterNeeded1 = pool1.waterToFillPool();
		double waterNeeded2 = pool2.waterToFillPool();
        System.out.println("\nWater needed to fill pool 1: " + waterNeeded1 + " cubic feet");
		System.out.println("Water needed to fill poo1 2: " + waterNeeded2 + " cubic feet");

        // Test timeToFillPool() method
        double timeToFill1 = pool1.timeToFillPool();
		double timeToFill2 = pool2.timeToFillPool();
        System.out.println("\nTime needed to fill pool 1: " + timeToFill1 + " seconds");
		System.out.println("Time needed to fill pool 2: " + timeToFill2 + " seconds");

        // Test timeToDrainPool() method
        double timeToDrain1 = pool1.timeToDrainPool();
		double timeToDrain2 = pool2.timeToDrainPool();
        System.out.println("\nTime needed to drain pool 1: " + timeToDrain1 + " seconds");
		System.out.println("Time needed to drain pool 2: " + timeToDrain2 + " seconds");

       // Fills the pool for 50 seconds
	   pool1.addWater(60);
	   pool2.addWater(75);

	   // Displays the current water level.
	   System.out.println("\nPool 1's current water level: " + pool1.waterLevel);
	   System.out.println("Pool 2's current water level: " + pool2.waterLevel);
		
	   // Drains water from pool1 and pool2.
	   pool1.drainWater(105);
	   pool2.drainWater(500);
    }
}
