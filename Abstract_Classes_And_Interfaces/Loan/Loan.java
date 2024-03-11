package Abstract_Classes_And_Interfaces.Loan;

/**
 * The type Loan.
 */
public abstract class Loan implements LoanConstants
{
    // Attributes of the Loan class.
    protected int loanNumber, term;
    protected double interestRate, loanAmount;
    protected String customerLastName;

    /**
     * Instantiates a new Loan Object.
     *
     * @param loanNumber The loan number.
     * @param term The term
     * @param loanAmount The loan amount
     * @param customerLastNAme The customer's last name.
     */
    public Loan(int loanNumber, int term, double loanAmount, String customerLastName)
    {
        if (loanAmount > MAXIMUM_LOAN || loanAmount <= 0)
        {
            System.out.println("\nInvalid loan amount!\nLoan amount must not be greater than $ 100,000 or less than or " +
                    "equal to 0.");
            return;
        }
        else
            this.loanAmount = loanAmount;

        if (term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM)
        {
            this.term = term;
        }
        else
        {
            System.out.println("\nInvalid Loan Term\nLoan term must be 1 year, 3 years or 5 years\nSetting your loan term" +
                    " to short term...");
            this.term = SHORT_TERM;
        }

        if (loanNumber < 100 || loanNumber > 999)
        {
            System.out.println("\nInvalid loan number!\nLoan number must be three digits.");
            return;
        }
        else
            this.loanNumber = loanNumber;

        this.customerLastName = customerLastName;
    }

    /**
     * This returns a string description of a Loan Object.
     *
     * @return String description of Loan Object.
     */
    @Override
    public String toString()
    {
        if (this.term == SHORT_TERM)
            return "\nCustomer Last Name: " + this.customerLastName + "\n" + "Loan Amount: $ " + this.loanAmount + "\n" +
                    "Loan Term: " + this.term + " year\n" + "Loan Number: " + this.loanNumber;
        return "\nCustomer Last Name: " + this.customerLastName + "\n" + "Loan Amount: $ " + this.loanAmount + "\n" +
                "Loan Term: " + this.term + " years\n" + "Loan Number: " + this.loanNumber;

    }
}
