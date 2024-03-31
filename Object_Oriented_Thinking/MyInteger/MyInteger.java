package Object_Oriented_Thinking.MyInteger;

/**
 * The type MyInteger.
 */
public class MyInteger
{
    // Attribute of an Integer.
    private int value;

    /**
     * Instantiates a new MyInteger Object.
     * @param value The value of the MyInteger Object.
     */
    public MyInteger(int value)
    {
        this.value = value;
    }

    /**
     * This returns the value of a MyInteger Object.
     * @return Value of a MyInteger.
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Checks if a MyInteger is even.
     * @return true if the MyInteger is even, else false.
     */
    public boolean isEven()
    {
        return this.getValue() % 2 == 0 ? true : false;
    }

    /**
     * Checks if a MyInteger is odd.
     * @return true if the MyInteger is odd, else false.
     */
    public boolean isOdd()
    {
        return this.getValue() % 2 != 0 ? true : false;
    }

    /**
     * Checks if a MyInteger is prime.
     * @return true if the MyInteger is prime, else false.
     */
    public boolean isPrime()
    {
        for (int i = 2; i < (this.getValue() / 2) + 1; i++)
        {
            if (this.getValue() % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Checks if an integer is even.
     * @return true if the integer is even, else false.
     */
    public static boolean isEven(int number)
    {
        return number % 2 == 0 ? true : false;
    }

    /**
     * Checks if an integer is odd.
     * @return true if the integer is odd, else false.
     */
    public static boolean isOdd(int number)
    {
        return number % 2 != 0 ? true : false;
    }

    /**
     * Checks if an integer is prime.
     * @return true if the integer is prime, else false.
     */
    public static boolean isPrime(int number)
    {
        for (int i = 2; i < (number / 2) + 1; i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Checks if the value in one MyInteger Object is same as the value in the other Object specified.
     * @param myInteger The other MyInteger Object.
     * @return true if both Objects are equal, else false.
     */
    public boolean equals(MyInteger myInteger)
    {
        return this.getValue() == myInteger.getValue();
    }

    /**
     * Checks if a MyInteger Object has the same value as an int.
     * @param number The int number to be compared with the myInteger Object.
     * @return true if the int number and the MyInteger Object has the same value, else false.
     */
    public boolean equals(int number)
    {
        return this.getValue() == number;
    }

    /**
     * This returns the int representation of a numeric String.
     * @param stringNumber The numeric String to be converted to int.
     * @return The int representation of a numeric String.
     */
    public static int parseInt(String stringNumber)
    {
        return Integer.parseInt(stringNumber);
    }
}
