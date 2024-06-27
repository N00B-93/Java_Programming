package Core_Java_Concepts.Generics.PairOfObjects;

public class Pair<T>
{
	// Attributes of the Pair class.
	private T first;
	private T second;

	/**
	 * Instantiates a new Pair Object.
	 *
	 * @param first The first value of the pair.
	 * @param second The second value of the pair.
	 */
	public Pair(T first, T second)
	{
        	this.first = first;
        	this.second = second;
    	}

	/**
	 * This returns the first value of a Pair.
	 *
	 * @return The first value of a Pair.
	 */
    	public T getFirst()
	{
        	return first;
    	}

	/**
	 * Sets the first value of a Pair to the specified value.
	 *
	 * @param first The new first value.
	 */
	public void setFirst(T first)
	{
        	this.first = first;
    	}

	/**
	 * This returns the second value of a Pair.
	 *
	 * @return The second value of a Pair.
	 */
	public T getSecond()
	{
        	return second;
	}

	/**
	 * Sets the second value of a Pair to the specified value.
	 *
	 * @param second The new second value.
	 */
    	public void setSecond(T second)
	{
		this.second = second;
	}

	/**
	 * This returns a String representation of aPair.
	 *
	 * @return A String representation of a Pair.
	 */
	@Override
	public String toString()
	{
		return "Pair{" +
			"first=" + first +
			", second=" + second +
			'}';
	}
}

