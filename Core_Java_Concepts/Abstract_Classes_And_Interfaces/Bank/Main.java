package Core_Java_Concepts.Abstract_Classes_And_Interfaces.Bank;

import java.util.ArrayList;

/**
    This is a program that creates a number of Account Object, adds them to an ArrayList of Accounts
    and then creates a Bank Object with the list of Accounts.
    The details of each Account and the total Bank asset is then displayed. Interest is then
    added to the interest bearing Accounts and then the details of each Account and the Bank asset is then
    redisplayed.
*/

public class Main
{
    public static void main(String[] args)
    {
        // Creates an ArrayList of Accounts.
        ArrayList<Account> accounts = new ArrayList<>();

        // Creates three types of Accounts.
        InterestCheckingAccount interestCheckingAccount = new InterestCheckingAccount("Adebisi Demilade",
                500000);
        NonInterestCheckingAccount nonInterestCheckingAccount = new NonInterestCheckingAccount(
                "Folashade Oriloye", 200000);
        PlatinumCheckingAccount platinumCheckingAccount = new PlatinumCheckingAccount("Alabeni Omosheye",
                1000000);

        // Adds the Accounts to the Accounts ArrayList.
        accounts.add(interestCheckingAccount);
        accounts.add(nonInterestCheckingAccount);
        accounts.add(platinumCheckingAccount);

        // Creates a Bank Object and pass the accounts to it as an argument.
        Bank bank = new Bank(accounts);

        // Displays the account details of each customer.
        displayAccountDetails(accounts);

        // Displays the total asset of the Bank before adding interest.
        System.out.printf("\nBank's Total Asset: $%.2f\n", bank.totalAssets());

        // Adds interest to all the interest bearing Accounts.
        System.out.println("\nAdding interests to all interest bearing account...");
        bank.addInterest();

        // Display the total asset of the Bank after adding interest.
        System.out.printf("\nBank's Total Asset: $%.2f\n", bank.totalAssets());

        // Displays the account details of each customer after adding interests.
        displayAccountDetails(accounts);
    }

    /**
     * Displays the account details of a list of Accounts.
     *
     * @param accounts The list of Accounts.
     */
    public static void displayAccountDetails(ArrayList<Account> accounts)
    {
        for (Account account: accounts)
            System.out.printf("\nCustomer Name: %s\nAccount Number: %d\nAccount Balance: $%.2f\n", account.getCustomerName(),
                    account.getAccountNumber(), account.getAccountBalance());
    }
}
