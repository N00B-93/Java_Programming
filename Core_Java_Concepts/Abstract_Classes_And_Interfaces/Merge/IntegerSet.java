package Core_Java_Concepts.Abstract_Classes_And_Interfaces.Merge;

import java.util.ArrayList;

public class IntegerSet implements Mergaeble
{
    // Attribute of an IntegerSet.
    private ArrayList<Integer> numberSet;

    /**
     * Instantiates a new IntegerSet Object.
     *
     * @param numberSet An arrayList of Integers.
     */
    public IntegerSet(ArrayList<Integer> numberSet)
    {
        this.numberSet = numberSet;
    }

    /**
     * This returns the number set of an IntegerSet Object.
     *
     * @return An ArrayList of numbers belonging to an IntegerSet.
     */
    public ArrayList<Integer> getNumberSet()
    {
        return this.numberSet;
    }

    /**
     * This determines whether a number exists in the number set of a IntegerSet Object.
     *
     * @param number The number whose existence in the number set of an IntegerSet is to be determined.
     * @return true if the number exists in the number set of an IntegerSet, else false.
     */
    public boolean elementOf(int number)
    {
        return this.numberSet.contains(number);
    }

    /**
     * Merges an IntegerSet numberSet field with the another IntegerSet numberSet field.
     *
     * @param another An IntegerSet Object whose numberSet field is to be merged with the current IntegerSet instance.
     * @return An IntegerSet Object whose numberSet field contains a merger of the current instance's numberSet field
     * and another IntegerSet numberSet field.
     * @throws ClassCastException If the argument is not an IntegerSet Object.
     */
    @Override
    public IntegerSet merge(Object another) throws ClassCastException
    {
        if (another == null || !(another instanceof IntegerSet))
            throw new ClassCastException("Argument must be of type IntegerSet");

        IntegerSet secondIntegerSet = (IntegerSet) another;

        IntegerSet mergedObject = new IntegerSet(new ArrayList<>(this.numberSet.size() + secondIntegerSet.numberSet.size()));
        mergedObject.numberSet.addAll(secondIntegerSet.numberSet);

        for (int element: this.numberSet)
        {
            if (!mergedObject.elementOf(element))
                mergedObject.numberSet.add(element);
        }

        return mergedObject;
    }

    /**
     * Displays the elements of the numberSet of an IntegerSet Object.
     */
    public void printElements()
    {
        int lineCounter = 0;

        for (int element: this.getNumberSet())
        {
            System.out.printf("%d ", element);
            ++lineCounter;

            if (lineCounter % 5 == 0)
                System.out.println();
        }
    }

    /**
     * This determines the number of elements in the numberSet of an IntegerSet.
     *
     * @return The number of elements in the numberSet of an IntegerSet.
     */
    public int size()
    {
        return this.numberSet.size();
    }
}
