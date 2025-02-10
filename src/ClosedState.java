

public class ClosedState implements AccountState {

    @Override
    public void deposit(Account account,double amount) {
        System.out.println("You cannot deposit on a closed account!");
    }

    @Override
    public void withdraw(Account account,double amount) {
        System.out.println("You cannot withdraw on a closed account!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("You cannot Activate a closed account!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("You cannot suspend a closed account!");
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is already closed!");
    }
}
