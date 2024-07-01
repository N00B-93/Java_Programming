package Core_Java_Concepts.Generics;

import java.util.ArrayList;

/*
    This is a program that creates a generic class named MyMathClass that has a single method standardDeviation which
    takes an ArrayList Object as an Argument and returns the Standard Deviation of the elements of the array as a list.
    The program then creates an Object of the MyMathClass class and an ArrayList Object, adds numbers to the array and then
    displays the standard deviation of the added numbers by calling the standardDeviation method in the MyMathClass class.
 */

/**
 * The type My math class.
 *
 * @param <T> The type parameter
 */
public class MyMathClass<T extends Number>
{
    /**
     * This returns the standard deviation of a generic Numerical list as a double.
     *
     * @param list The list containing numerical elements whose standard deviation are to be determined.
     * @return The Standard Deviation of the elements of the list.
     */
    public double standardDeviation(ArrayList<? extends Number> list)
    {
        double mean, sum = 0, meanDeviation = 0;

        for (Number value : list)
        {
            sum += value.doubleValue();
        }

        mean = sum / list.size();

        for (Number number : list)
        {
            meanDeviation = Math.pow(number.doubleValue() - mean, 2);
        }

        return Math.sqrt(meanDeviation / (list.size() - 1));
    }

    public static void main(String[] args)
    {
        // Creates an Object of the MyMathClass class.
        MyMathClass<Double> myMathClass = new MyMathClass<>();

        // Creates an ArrayList Object to hold list of numbers whose standard deviation are to be determined.
        ArrayList<Double> list = new ArrayList<>();

        // Adds elements to the ArrayList.
        list.add(10.5);
        list.add(15.2);
        list.add(-2.3);
        list.add(14.4);
        list.add(3.65);

        // Displays the Standard Deviation of the ArrayList.
        System.out.printf("\nThe Standard Deviation is: %.2f\n\n", myMathClass.standardDeviation(list));
    }
}
