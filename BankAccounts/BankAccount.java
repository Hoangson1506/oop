package BankAccounts;

public abstract class BankAccount {
    protected double currentBalance;
    protected double totalTransaction;
    public BankAccount(double balance) {
        this.currentBalance = balance;
        totalTransaction = 0;
    }
    public void deposit(double amount) {
        currentBalance += amount;
        totalTransaction++;
    }
    public void withdraw(double amount) {
        currentBalance = currentBalance <= amount ? 0 : currentBalance - amount;
        totalTransaction++;

    }
    public abstract void endMonth();
}
