package Abstract_Classes_And_Interfaces.Loan;

import java.util.Scanner;
import java.util.ArrayList;

/*
    This is a program that prompts the user to enter the loan number, loan term, loan amount, prime interest rate and
    the user's last name and the creates either a PersonalLoan or a BusinessLoan Object based on the user's preference.
    The program continues to prompt the user to enter these values until the user wishes to opt out. After this, the
    details of the Loan is displayed including the amount payable after the Loan term is passed.
 */

public class CreateLoans
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        // Creates an ArrayList Object.
        ArrayList<Loan> loans = new ArrayList<>();

        // Prompts the user to enter the current prime interest rate.
        System.out.print("\nEnter the current prime interest rate(e.g., 9%): ");
        double primeInterestRate = keyBoard.nextDouble();

        String choice = "";

        while (!choice.equals("n"))
        {
            // Prompts the user to select the kind of loan he/she wants to take.
            System.out.print("""
                            \nWhat loan would you like to take?
                            \n1. Business Loan
                            \n2. Personal Loan\n 
                    """);
            System.out.print("Enter a choice: ");
            choice = keyBoard.next();

            if (!"12".contains(choice))
            {
                System.out.println("\nInvalid Choice!!!\nTry again.");
                continue;
            }

            // Prompts the user to enter the loan number, loan term, loan amount, customer last name.
            System.out.printf("\nEnter the 3-digit loan number(e.g. 000): ");
            int loanNumber = keyBoard.nextInt();
            System.out.printf("\nEnter the loan term in years: ");
            int term = keyBoard.nextInt();
            System.out.printf("\nEnter the loan amount less than or equal to $ 100,000: $ ");
            double loanAmount = keyBoard.nextDouble();
            System.out.printf("\nEnter your last name: ");
            String customerName = keyBoard.next();

            // Adds a loan to the Loans ArraysList based on the user's choice.
            if (choice.equals("1"))
            {
                BusinessLoan businessLoan = new BusinessLoan(loanNumber, term, loanAmount, customerName, primeInterestRate);

                if (businessLoan.loanAmount != 0 && businessLoan.loanNumber != 0)
                {
                    loans.add(businessLoan);

                    // Informs the user that the Loan has been granted.
                    System.out.println("\nLoan Granted!!!");
                }
            }
            else if (choice.equals("2"))
            {
                PersonalLoan personalLoan = new PersonalLoan(loanNumber, term, loanAmount, customerName, primeInterestRate);

                if (personalLoan.loanAmount != 0 && personalLoan.loanNumber != 0)
                {
                    loans.add(personalLoan);

                    // Informs the user that the Loan has been granted.
                    System.out.println("\nLoan Granted!!!");
                }
            }

            // Asks the user if he/she would like to take another loan.
            System.out.printf("\nWould you like to take another Loan('y', 'n')? ");
            choice = keyBoard.next();

            // Continues to prompt the user to enter the right choice if the user enters a wrong choice.
            while (!"yn".contains(choice))
            {
                System.out.println("\nInvalid choice, Enter 'y' or 'n'.");
                System.out.printf("\nWould you like to take another Loan('y', 'n')? ");
                choice = keyBoard.next();
            }
        }

        // Display information about each loan in the ArrayList of Loans.
        System.out.println("\n\t\tLoans Details");
        for (Loan loan: loans)
        {
            System.out.println(loan.toString());
            System.out.printf("Amount Payable after Loan ends: $ %.2f\n", amountAfterLoanDue(loan));
        }
    }

    /**
     * This returns the amount payable by the Customer after his/her loan ends.
     *
     * @param loan The Loan Object representing the Customer's Loan.
     * @return The amount payable by the Customer after his/her loan ends.
     */
    public static double amountAfterLoanDue(Loan loan)
    {
        return loan.loanAmount * Math.pow((1 + loan.interestRate / 100.0), loan.term);
    }
}
