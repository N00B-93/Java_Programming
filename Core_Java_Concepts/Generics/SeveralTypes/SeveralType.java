package Core_Java_Concepts.Generics.SeveralTypes;

public class SeveralType<E, F>
{
    // Attributes of the class SeveralType.
    private E first;
    private F second;

    /**
     * Instantiates a new Object of the SeveralType class.
     *
     * @param first The first value.
     * @param second The second value.
     */
    public SeveralType(E first, F second)
    {
        this.first = first;
        this.second = second;
    }

    /**
     * This returns the first value.
     *
     * @return The first value.
     */
    public E getFirst()
    {
        return this.first;
    }

    /**
     * This returns the second value.
     *
     * @return The second value.
     */
    public F getSecond()
    {
        return this.second;
    }

    /**
     * Sets the first value to the specified value.
     *
     * @param first The new first value.
     */
    public void setFirst(E first)
    {
        this.first = first;
    }

    /**
     * Sets the second value to the specified value.
     *
     * @param second The new second value.
     */
    public void setSecond(F second)
    {
        this.second = second;
    }

    /**
     * This returns a String representation of a SeveralType Object.
     *
     * @return A String representation of a SeveralType Object.
     */
    @Override
    public String toString()
    {
        return "SeveralType{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
