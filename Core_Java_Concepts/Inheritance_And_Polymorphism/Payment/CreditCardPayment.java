package Inheritance_And_Polymorphism.Payment;

import java.text.NumberFormat;
import java.util.Locale;

public class CreditCardPayment extends Payment
{
    // Attributes of a CreditCardPayment Object.
    protected String cardName;
    protected String expiryDate;
    protected long cardNumber;

    /**
     * Instantiates a new CreditCardPayment Object.
     *
     * @param amount The amount.
     * @param cardName The card name.
     * @param expiryDate The card expiry date
     * @param cardNumber The card number.
     */
    public CreditCardPayment(double amount, String cardName, String expiryDate, int cardNumber)
    {
        super(amount);
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    /**
     * Displays information about the payment type.
     */
    @Override
    public void paymentDetails()
    {
        NumberFormat unitedState = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("\nAmount: "  + unitedState.format(this.getAmount()));
        System.out.printf("Card Name: %s\nCard Number: %d\nCard Expiry Date: %s\n", this.cardName, this.cardNumber, this.expiryDate);
    }
}
