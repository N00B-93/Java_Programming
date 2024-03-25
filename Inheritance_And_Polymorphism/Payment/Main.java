package Inheritance_And_Polymorphism.Payment;

import java.util.ArrayList;

/*
    This is a program that creates two CashPayment Objects and two CreditCardPayment Object and then displays the payment
    details for each of the Object.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates an ArrayList of Payment Objects.
        ArrayList<Payment> payment = new ArrayList<>();

        // Creates two CashPayment Objects and two CreditCardPayment Objects.
        CashPayment cashPayment1 = new CashPayment(3500.25);
        CashPayment cashPayment2 = new CashPayment(4215.66);
        CreditCardPayment creditCardPayment1 = new CreditCardPayment(1627.33, "Adebisi Demilade",
                "10/05/2001", 131071);
        CreditCardPayment creditCardPayment2 = new CreditCardPayment(6538.99, "Nneoma Agwu",
                "15/09/2002", 778778);

        // Adds the Payment Object to the ArrayList.
        payment.add(cashPayment1);
        payment.add(cashPayment2);
        payment.add(creditCardPayment1);
        payment.add(creditCardPayment2);

        // Displays the Payment details of each Object.
        System.out.println("\n\t\tPayment Details.");
        for (Payment paymentObject: payment)
        {
            paymentObject.paymentDetails();
        }
    }
}
