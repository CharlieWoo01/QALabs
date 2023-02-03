package lab08;

public class Program {

    public static void main(String args[]) {
        Account account = new Account(1, "Charlie");
        account.deposit(40.0);
        account.withdraw(20.1);
        account.getDetails();

        Account partnerAccount = new Account(2, "My Partner");
        partnerAccount.deposit(40.0);
        partnerAccount.addInterest();
        partnerAccount.getDetails();
    }
}