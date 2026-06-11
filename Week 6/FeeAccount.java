public class FeeAccount extends BankAccount {
  private static final double fee = 2.00;
  public FeeAccount()
  {
    super();
  }
  public FeeAccount(double bal)
  {
    super(bal);
  }
  public void withdraw(double amount)
  {
    super.withdraw(amount + fee);
  }
   public String toString() {     // overriding
    return " $" + super.getBalance()
      + " (Fee: $" + fee + ")";
} }
