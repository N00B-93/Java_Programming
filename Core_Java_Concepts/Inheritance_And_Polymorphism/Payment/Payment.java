package Inheritance_And_Polymorphism.Payment;

import java.util.Locale;
import java.text.NumberFormat;

public class Payment
{
    protected double amount;

    // No-arg constructor.
    public Payment() {}

    /**
     * Instantiates a new Payment.
     *
     * @param amount The amount.
     */
    public Payment(double amount)
    {
        this.amount = amount;
    }

    /**
     * This returns the payment amount.
     *
     * @return The payment amount.
     */
    public double getAmount()
    {
        return amount;
    }

    /**
     * This sets the amount to the specified value.
     *
     * @param amount The payment amount.
     */
    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    /**
     * Displays information about the payment type.
     */
    public void paymentDetails()
    {
        NumberFormat unitedState = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("The Payment amount is: " + unitedState.format(this.amount));
    }
}
