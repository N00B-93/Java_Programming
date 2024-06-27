package Abstract_Classes_And_Interfaces.Loan;

public class BusinessLoan extends Loan
{
    /**
     * Instantiates a new Business loan Object.
     *
     * @param loanNumber The loan number.
     * @param term The term.
     * @param loanAmount The loan amount.
     * @param customerLastName The customer last name.
     * @param primeInterestRate The prime interest rate.
     */
    public BusinessLoan(int loanNumber, int term, double loanAmount, String customerLastName, double primeInterestRate)
    {
        super(loanNumber, term, loanAmount, customerLastName);
        this.interestRate = primeInterestRate + 1.0;
    }

    /**
     * This returns a string description of a BusinessLoan Object.
     *
     * @return String description of BusinessLoan Object.
     */
    @Override
    public String toString()
    {
        return "\nLoan Type: Business Loan" + super.toString() + "\nInterest Rate: " + this.interestRate + "%";
    }
}
