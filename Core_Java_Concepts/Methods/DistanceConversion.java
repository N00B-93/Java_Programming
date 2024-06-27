package Methods;

/*
    This is a program that converts distance from miles to kilometers and kilometers
    to miles using two methods with headers;
                public static double kilometerToMile(double kilometer)
                public static double mileToKilometer(double mile)
 */

public class DistanceConversion
{
    /**
     * Converts distance from miles to kilometers
     *
     * @param miles The distance to be converted in miles.
     * @return The distance in kilometers.
     */
    public static double mileToKilometer(double miles)
    {
        return miles * 1.609;
    }

    /**
     * Converts distance from kilometers to miles.
     *
     * @param kilometers The distance to be converted in kilometers.
     * @return The distance in miles.
     */
    public static double kilometerToMile(double kilometers)
    {
        return kilometers / 1.609;
    }

    public static void main(String[] args)
    {
        // Displays distances converted from miles to kilometers and vice versa in tabular form.
        System.out.println("\nMiles\tKilometers\t|\tKilometers\tMiles");
        for (int mile = 1, kilometer = 20; mile <= 10 && kilometer <= 65; mile++, kilometer += 5)
        {
            System.out.printf("%d\t\t%10.3f\t|\t%d\t\t%10.3f\n", mile, mileToKilometer(mile), kilometer, kilometerToMile(kilometer));
        }
    }
}
