public class Loans
{
// Our instance variables - notice they are private
private double principal;
private double periods;
private double interest;
private double repayment;

// This is the Constructor – more about it later
    public Loans(double principal, double periods, double interest_rate)
    {
        this.principal = principal;
        this.periods = periods;
        interest = interest_rate;
        calcLoan();
    }

// This method calculates the loan - let's not worry how!
    private void calcLoan()
    {
        // code here to do the work! Updates repayment.
    }

// Now we allow the class user to access the repayment amount
    public double getRepayment()
    {
        return repayment;
    }
} // end of class
