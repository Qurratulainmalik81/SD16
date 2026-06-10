public class BankAccount{
    private double myBal;
    public BankAccount()
    {
        this.myBal = 0;
    }
    public BankAccount(double bal)
    {
        this.myBal = bal;
    }
    public double getBalance()
    {
        return this.myBal;
    }
    public void setBalance(double bal)
    {
        this.myBal = bal;
    }
    public void deposit(double amount)
    {
        this.myBal = this.myBal + amount;
    }
    
    public void withdraw(double amount)
    {
        if(this.myBal >=amount)
            this.myBal = this.myBal - amount;
        else
            System.out.println("Do not have enough balance");


    }
    public String toString()
    {
        return (" My Balance = " + this.myBal);
    }

}