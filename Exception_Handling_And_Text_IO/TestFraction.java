
import java.util.Scanner;

class NullDenominatorException extends Exception
{
	String message;

	public NullDenominatorException(){}

	public NullDenominatorException(String message)
	{
		this.message = message;
	}
	
	@Override
	public String getMessage()
	{
		return this.message;
	}
}
	
class Fraction
{
	int numerator, denominator;

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
