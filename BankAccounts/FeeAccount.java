package BankAccounts;

public class FeeAccount extends BankAccount{
    private static final double fee = 5;
    public FeeAccount(double balance) {
        super(balance);
    }

    @Override
    public void endMonth() {
        currentBalance -= fee;
    }
}
