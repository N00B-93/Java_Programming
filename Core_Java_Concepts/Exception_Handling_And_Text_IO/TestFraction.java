package Exception_Handling_And_Text_IO;

import java.util.Scanner;

/*
	This program creates a class named Fraction with two integer fields numerator and denominator
	and an exception class named NullDenominatorException that is a checked exception. The constructor of the Fraction class
	creates a fraction with a given numerator and denominator but throws a checked exception when the denominator is 0.
 */

class NullDenominatorException extends Exception
{
	String message;

	public NullDenominatorException(){}

	/**
	 * Instantiates a new Null denominator exception.
	 *
	 * @param message The error message to be displayed
	 */
	public NullDenominatorException(String message)
	{
		this.message = message;
	}

	/**
	 * Returns an error message to the caller.
	 *
	 * @return message Error message.
	 */
	@Override
	public String getMessage()
	{
		return this.message;
	}
}
	
class Fraction
{
	int numerator, denominator;

	/**
	 * Instantiates a new Fraction.
	 *
	 * @param numerator   The numerator
	 * @param denominator The denominator
	 * @throws NullDenominatorException the null denominator exception
	 */
	public Fraction(int numerator, int denominator) throws NullDenominatorException
	{
		if (denominator == 0)
			throw new NullDenominatorException("\nDenominator cannot be zero.");
		this.numerator = numerator;
		this.denominator = denominator;
	}
}

public class TestFraction
{
	public static void main(String... args)
	{
		try
		{
			Fraction fraction1 = new Fraction(5, 0);
			Fraction fraction2 = new Fraction(6, 4);
		}
		catch (NullDenominatorException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
