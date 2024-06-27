package Objects_And_Classes;

import java.util.Scanner;

public class QuadraticEquation
{
	// Fields representing the coefficients of a Quadratic Equation.
	private double a, b, c;

	/**
	 * Instantiates a new Quadratic equation Object.
	 *
	 * @param a The coefficient of x^2.
	 * @param b The coefficient of x.
	 * @param c The constant coefficient.
	 */
	public QuadraticEquation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Returns the value of a.
	 *
	 * @return The value of a.
	 */
	public double getA()
	{
		return a;
	}

	/**
	 * Returns the value of b.
	 *
	 * @return The value of b.
	 */
	public double getB()
	{
		return b;
	}

	/**
	 * Returns the value of c.
	 *
	 * @return The value of c.
	 */
	public double getC()
	{
		return c;
	}

	/**
	 * Returns the value of the discriminant.
	 *
	 * @return The value of discriminant.
	 */
	public double getDiscriminant()
	{
		return (b * b - 4 * a * c);
	}

	/**
	 * Returns the value of the first root.
	 *
	 * @return The value of first root.
	 */
	public double getRoot1()
	{
		return ((-b + Math.sqrt(getDiscriminant())) / 2 * a);
	}

	/**
	 * Returns the value of the second root.
	 *
	 * @return The value of second root.
	 */
	public double getRoot2()
	{
		return ((-b - Math.sqrt(getDiscriminant())) / 2 * a);
	}

	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		//Reads in the coefficients of a Quadratic Equation.
		System.out.printf("\nEnter the values of a, b and c separated by space: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// Creates a Quadratic Equation Object.
		QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

		// Displays the Discriminant.
		System.out.printf("\nDiscriminant: %.2f\n", quadraticEquation.getDiscriminant());

		// Displays the roots of the equation.
		if (quadraticEquation.getDiscriminant() > 0)
			System.out.printf("\nThe roots are: %.2f, %.2f\n", quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
		else if (quadraticEquation.getDiscriminant() == 0)
			System.out.printf("\nThe root is: %.2f\n", quadraticEquation.getRoot1());
		else
			System.out.print("\nThe equation has no roots.\n\n");
	}
}
