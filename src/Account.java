public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;
    public Account (String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void withdraw (double balance){
        accountState.withdraw(this, balance);
    }

    public void deposit (double balance){
        accountState.deposit(this, balance);
    }

    public void activate (){
        accountState.activate(this);
    }

    public void suspend (){
        accountState.suspend(this);
    }

    public void close (){
        accountState.close(this);
    }


    public String toString() {

        return "Account number: " + this.accountNumber + "\nBalance: " + this.balance;
    }
}
