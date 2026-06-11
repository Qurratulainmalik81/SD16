public class CheckingAccount extends BankAccount {
    private double myInterest;

    public CheckingAccount()
    {
        this.myInterest = 0.0;
    }
    public CheckingAccount(double interest)
    {
        myInterest = interest;
    }
    public CheckingAccount(double interest, double bal)
    {
        this.myInterest = interest;
        super(bal);//calling the constructor of the parent class to use this balance value
    }
    public double getInterest()
    {
        return this.myInterest;
    }
    public void setInterest(double interest)
    {
        this.myInterest = interest;
    }
    public void applyInterest() { 
        double interestAmount = super.getBalance() * this.myInterest/100;
        super.setBalance(super.getBalance()+interestAmount);
     }

    public String toString()
    {
        return ("Interest = " + this.myInterest + super.toString());
    }

}
