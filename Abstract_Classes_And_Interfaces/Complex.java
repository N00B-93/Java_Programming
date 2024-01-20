package Abstract_Classes_And_Interfaces;

import java.util.Scanner;

/*
    This is a program that designs a class named Complex for representing complex numbers and the
    methods add, subtract, multiply, divide, and abs for performing complex number
    operations, and override toString method for returning a string representation
    for a complex number. The toString method returns (a + bi) as a
    string. The  Complex class also implement the Cloneable interface.
    The program also prompts the user to enter two complex numbers and
    displays the result of their addition, subtraction, multiplication, division, and absolute
    value.
 */

/**
 * The type Complex.
 */
public class Complex implements Cloneable
{

    private double realPart, imaginaryPart;


    /**
     * Instantiates a new Complex.
     *
     * @param realPart      the real part
     * @param imaginaryPart the imaginary part
     */
    public Complex(double realPart, double imaginaryPart)
    {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    /**
     * Instantiates a new Complex.
     *
     * @param imaginaryPart the imaginary part
     */
    public Complex(double realPart)
    {
        this.imaginaryPart = realPart;
    }

    /**
     * Instantiates a new Complex.
     */
    public Complex(){}

    /**
     * Gets imaginary part.
     *
     * @return the imaginary part
     */
    public double getImaginaryPart()
    {
        return imaginaryPart;
    }

    /**
     * Gets real part.
     *
     * @return the real part
     */
    public double getRealPart()
    {
        return realPart;
    }

    /**
     * Add complex.
     *
     * @param complex the complex
     * @return the complex
     */
    public Complex add(Complex complex)
    {
        double real = this.getRealPart() + complex.getRealPart();

        double imaginary = this.getImaginaryPart() + complex.getImaginaryPart();

        Complex result = new Complex(real, imaginary);
        return result;
    }

    /**
     * Subtract complex.
     *
     * @param complex the complex
     * @return the complex
     */
    public Complex subtract(Complex complex)
    {
        double real = this.getRealPart() - complex.getRealPart();

        double imaginary = this.getImaginaryPart() - complex.getImaginaryPart();

        Complex result = new Complex(real, imaginary);
        return result;
    }

    /**
     * Abs double.
     *
     * @return the double
     */
    public double abs()
    {
        return Math.sqrt(Math.pow(this.getRealPart(), 2) + Math.pow(this.getImaginaryPart(), 2));
    }

    /**
     * Multiply complex.
     *
     * @param complex the complex
     * @return the complex
     */
    public Complex multiply(Complex complex)
    {
        double real = this.getRealPart() * complex.getRealPart() + (-1 * this.getImaginaryPart() * complex.getImaginaryPart());

        double imaginary = this.getRealPart() * complex.getImaginaryPart() + this.getImaginaryPart() * complex.getRealPart();

        Complex result = new Complex(real, imaginary);
        return result;
    }

    /**
     * Divide complex.
     *
     * @param complex the complex
     * @return the complex
     */
    public Complex divide(Complex complex)
    {
        double re = complex.getRealPart();
        double im = complex.getImaginaryPart();

        Complex conjugate = new Complex(re, -im);
        Complex numerator = (this.multiply(conjugate));

        Complex result = new Complex(numerator.getRealPart() / (complex.abs() * complex.abs()),
                numerator.getImaginaryPart() / (complex.abs() * complex.abs()));
        return result;
    }

    /*
     * @return The string representation of a complex number.
     */
    public String toString()
    {
        return (this.getRealPart() + " " + "+ " + this.getImaginaryPart() + "i");
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the real and imaginary parts of two complex numbers.
        System.out.printf("\nEnter the real and imaginary part of Complex1 separated by space: ");
        double real1 = input.nextDouble();
        double imag1 = input.nextDouble();

        System.out.printf("\nEnter the real and imaginary part of Complex2 separated by space: ");
        double real2 = input.nextDouble();
        double imag2 = input.nextDouble();

        // Creates two Complex Objects.
        Complex complex1 = new Complex(real1, imag1);
        Complex complex2 = new Complex(real2, imag2);

        // Performs add, subtract, multiply, divide and absolute operations on both complex numbers.
        System.out.printf("\n(%.2f + %.2fi) + (%.2f + %.2fi) = %s\n", complex1.getRealPart(), complex1.getImaginaryPart(),
                complex2.getRealPart(), complex2.getImaginaryPart(), (complex1.add(complex2)).toString());

        System.out.printf("\n(%.2f + %.2fi) - (%.2f + %.2fi) = %s\n", complex1.getRealPart(), complex1.getImaginaryPart(),
                complex2.getRealPart(), complex2.getImaginaryPart(), (complex1.subtract(complex2)).toString());

        System.out.printf("\n(%.2f + %.2fi) * (%.2f + %.2fi) = %s\n", complex1.getRealPart(), complex1.getImaginaryPart(),
                complex2.getRealPart(), complex2.getImaginaryPart(), (complex1.multiply(complex2)).toString());

        System.out.printf("\n(%.2f + %.2fi) / (%.2f + %.2fi) = %s\n", complex1.getRealPart(), complex1.getImaginaryPart(),
                complex2.getRealPart(), complex2.getImaginaryPart(), (complex1.divide(complex2)).toString());

        System.out.printf("\n|(%.2f + %.2f)| = %.2f\n",  complex1.getRealPart(), complex1.getRealPart(), complex1.abs());
    }
}
