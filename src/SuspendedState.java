

public class SuspendedState implements AccountState {
    @Override
    public void deposit(Account account,double amount) {
        System.out.println("Account is suspended!");
    }

    @Override
    public void withdraw(Account account,double amount) {
        System.out.println("Account is suspended!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is activated!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is closed!");
    }
}
