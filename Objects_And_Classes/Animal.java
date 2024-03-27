package Objects_And_Classes;

/**
 * The type Animal.
 */
public class Animal
{
	// Attributes of an Animal.
	private String specie;
	private int population;
	private double growthRate;
	
	/**
	 * Instantiates a new Animal.
	 * @param specie The Animal's specie.
	 * @param population The Animal's population.
	 * @param growthRate The Animal's growthRate.
	 */
	public Animal(String specie, int population, double growthRate)
	{
		this.specie = specie;
		this.population = population;
		this.growthRate = growthRate;
	}

	/**
	 * This returns the Animal's specie.
	 *
	 * @return The Animal's specie.
	 */
	public String getSpecie()
	{
		return this.specie;
	}

	/**
	 * Sets the Animal's Specie to the specified value.
	 * @param specie The Animal's specie.
	 */
	public void setSpecie(String specie)
	{
		this.specie = specie;
	}

	/**
	 * This returns the population of a particular specie of Animal.
	 *
	 * @return The population of a particular Specie of Animal.
	 */
	public int getPopulation()
	{
		return this.population;
	}

	/**
	 * Sets the population of a particular specie of Animal to the given value.
	 *
	 * @param The Animal population.
	 */
	public static void setPopulation(int population)
	{
		this.population = population;
	}

	/**
	 * This returns the growth rate of a specie of Animal.
	 *
	 * @return The growth rate of the specie.
	 */
	public double getGrowthRate()
	{
		return this.growthRate;
	}

	/**
	 * Sets the growth rate to the given value.
	 *
	 *@param growthRate The growth rate.
	 */
	public void setGrowthRate(double growthRate)
	{
		this.growthRate = growthRate;
	}
	
	/**
	 * This returns a String containing information about an Animal Object.
	 *
	 * @return String describing an Animal.
	 */
	@Override
	public String toString()
	{
		return "Specie: " + this.specie + "\n" + "Population: " + this.population + "\n" + "Growth Rate: "  + this.growthRate;
	}
	
	/**
	 * This checks whether two Animals are the same based on their specie.
	 *
	 * @param another The other animal to compare with.
	 *
	 * @return true if both Animal have the same specie, else false.
	 */
	@Override
	public boolean equals(Animal another)
	{
		return this.specie == another.getSpecie();
	}

	/**
	 * This checks whether a specie of Animal is endangered or not.
	 *
	 * @return true if the Animal is endangered, else returns false.
	 */
	public boolean isEndangered()
	{
i		return this.growthRate > 0.0;
	}
}

