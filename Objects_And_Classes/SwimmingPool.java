package Objects_And_Classes;

class SwimmingPool
{
	// Attributes of a SwimmingPool.
	protected double length, width, depth, fillingRate, drainingRate, waterLevel;

	/**
	 * Instantiates a new SwimmingPool.
	 * @param length The length of the SwimmingPool.
	 * @param width The width of thw SwimmingPool.
	 * @param depth The depth of the SwimmingPool
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
}
