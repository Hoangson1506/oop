package BankAccounts;

public class NickleNDimeAccount extends BankAccount{
    public NickleNDimeAccount(double balance) {
        super(balance);
    }
    private double caculateFee() {
        return totalTransaction * 0.5;
    }
    @Override
    public void endMonth() {
        currentBalance -= caculateFee();
    }
}
