package Methods;

/*
    This is a program that converts weight from pounds to kilograms and from
    kilograms to pounds using two methods with headers;
                    public static double poundToKilogram(double pound)
                    public static double kilogramToPound(double kilogram)
 */
public class WeightConversion
{
    /**
     * Converts weight from pounds to kilograms.
     *
     * @param pound The weight to be converted to kilograms.
     * @return The weight in kilograms.
     */
    public static double poundToKilogram(double pound)
    {
        return pound * 0.453;
    }

    /**
     * Converts weight from kilograms to pounds.
     *
     * @param kilogram The weight to be converted to pounds.
     * @return The weight in pounds
     */
    public static double kilogramToPound(double kilogram)
    {
        return kilogram * 2.204;
    }

    public static void main(String[] args)
    {
        // Displays weight converted from kilograms to pounds and pounds to kilograms.
        System.out.println("\nKilograms\tPounds\t\t|\tPounds\tKilograms");
        for (int kilogram = 1, pound = 20; kilogram <= 199 && pound <= 515; kilogram += 2, pound += 5)
        {
            System.out.printf("%d\t\t%10.1f\t\t|\t\t%d\t\t%.2f\n", kilogram, kilogramToPound(kilogram), pound, poundToKilogram(pound));
        }
    }
}
