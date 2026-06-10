public class Demo {
    public static void main(String args[])
{
    BankAccount b1 = new BankAccount();
   
    CheckingAccount ch1 = new CheckingAccount();
    ch1.deposit(500);
    System.out.println(ch1);
    ch1.withdraw(100);
    System.out.println(ch1);
    ch1.withdraw(1000);

    TransactionFeeCheckingAccount TFCA = new TransactionFeeCheckingAccount(0.5,500);
    TFCA.withdraw(100);
    System.out.println(TFCA);
//     CheckingAccount ch2 = new CheckingAccount(0.3,1000);
//     System.out.println(ch2);
//     ch2.applyInterest();
//      System.out.println(ch2);
// }
}
}