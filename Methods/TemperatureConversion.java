package Methods;

/*
	This is a program that converts temperature from Celsius to Fahrenheit and Fahrenheit to Celsius by using methods with the headers;
			public static double celsiusToFahrenheit(double celsius)
			public static double fahrenheitToCelsius(fahrenheit)
*/

public class TempConversion
{
	public static void main(String... args)
	{
		double celsius = 0, fahrenheit = 0;
		System.out.printf("\nCel\tFah\t|\tFah\tCel\n");
		System.out.printf("--------------------------------------\n");

		for (celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0 && fahrenheit >= 30.0; celsius--, fahrenheit -= 10.0)
		{
			System.out.printf("%.1f\t%.1f\t|", celsius, celsiusToFahrenheit(celsius));
			System.out.printf("\t%.2f\t%.2f\n", fahrenheit, fahrenheitToCelsius(fahrenheit));
		}
	}
	
	/**
	 * Convert a given temperature from Celsius to Fahrenheit.
	 *
	 * @param celsius The Celsius temperature to be converted.
	 *
	 * @return The Fahrenheit equivalent of a temperature.
	 */
	public static double celsiusToFahrenheit(double celsius)
	{
		return ((celsius * 9 / 5.0) + 32);
	}
	
	/**
	 * Converts a given temperature from Fahrenheit to Celsius.
	 *
	 * @param fahrenheit The temperature to be converted.
	 *
	 * @return The Celsius equivalent of a temperature.
	 */
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		return ((5.0 / 9.0) * (fahrenheit - 32));
	}
}

