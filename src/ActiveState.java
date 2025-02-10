

public class ActiveState implements AccountState {


    @Override
    public void deposit(Account account,double amount) {
        System.out.println("Deposited amount: " + amount );
        account.setBalance(account.getBalance() + amount);
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(Account account,double amount) {
         account.setBalance(account.getBalance() - amount);
         System.out.println("Withdrawn amount: " + amount);
         System.out.println(account.toString());
    }


    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is suspended");
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is closed");
    }
}
