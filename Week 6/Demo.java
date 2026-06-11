public class Demo {
    public static void main(String args[])
{
    // BankAccount b = new FeeAccount( 9.00);
    // b.withdraw(5.00);
    // System.out.println(b);


    // BankAccount b1 = new BankAccount();
    // CheckingAccount ch1 = new CheckingAccount();

    // BankAccount b2 = new CheckingAccount();
    //
    // BankAccount TFCA1 = new TransactionFeeCheckingAccount(0.5,5000);
    // TFCA1.withdraw(100);
    // System.out.println(TFCA1);
    
    //CheckingAccount ch2 = new BankAccount();

    // ch1.deposit(500);
    // System.out.println(ch1);
    // ch1.withdraw(100);
    // System.out.println(ch1);
    // ch1.withdraw(1000);

     TransactionFeeCheckingAccount TFCA = new TransactionFeeCheckingAccount(0.5,5000);
     TFCA.withdraw(100);
     System.out.println(TFCA);
     TFCA.chargeFee();
     System.out.println(TFCA);
//     CheckingAccount ch2 = new CheckingAccount(0.3,1000);
//     System.out.println(ch2);
//     ch2.applyInterest();
//      System.out.println(ch2);

}
}