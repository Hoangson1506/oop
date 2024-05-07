package BankAccounts;

import java.util.Random;

public class GamblerAccount extends BankAccount{
    private Random random;
    private static final double fee = 5;
    public GamblerAccount(double balance) {
        super(balance);
        random = new Random();
    }
    @Override
    public void endMonth() {
        double luckyFee = random.nextDouble();
        currentBalance = luckyFee <= 0.49 ? currentBalance : currentBalance - (fee * 2);
    }
}
