public class TransactionFeeCheckingAccount extends CheckingAccount {
private static final double FEE = 2.00;

public TransactionFeeCheckingAccount() {
}
public TransactionFeeCheckingAccount(double interest) {
super(interest);
}
public TransactionFeeCheckingAccount(double interest,double bal) {
super(interest,bal);
}

//Can add methods of your choice
  public void chargeFee() {
    super.withdraw(0.0);
  }

  public void withdraw(double amount)
    {
        super.withdraw(amount + FEE);
    }
    public String toString()
    {
        return("FEE" + this.FEE + " " + super.toString());
    }
}
