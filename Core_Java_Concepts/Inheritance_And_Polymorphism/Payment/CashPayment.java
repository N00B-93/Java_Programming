package Inheritance_And_Polymorphism.Payment;

import java.text.NumberFormat;
import java.util.Locale;

public class CashPayment extends Payment
{
    /**
     * Instantiates a new CashPayment Object.
     *
     * @param amount The amount.
     */
    public CashPayment(double amount)
    {
        super(amount);
    }

    /**
     * Displays information about the payment type.
     */
    @Override
    public void paymentDetails()
    {
        NumberFormat unitedState = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("\nThe Payment is made in cash\nAmount is: " + unitedState.format(this.amount));
    }
}
