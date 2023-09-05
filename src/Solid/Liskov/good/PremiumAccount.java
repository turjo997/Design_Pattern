package Solid.Liskov.good;

import java.math.BigDecimal;
/*
In this example, both BankingAppWithdrawalService and
PremiumAccount are subclasses of Account. They override the deposit and withdraw
methods from the superclass Account. Hence, they are substitutable for Account because
they fulfill the contract provided by the Account class.
*/

public class PremiumAccount implements Account,NonWithdrawableAccount {
    private BigDecimal balance;
    private double rewardPoints;
    public PremiumAccount(BigDecimal initialBalance) {
        this.balance = initialBalance;
    }
    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        updateRewardsPoints();
    }
    @Override
    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            updateRewardsPoints();
        } else {
            throw new IllegalArgumentException("Insufficient balance");
        }
    }
    private void updateRewardsPoints() {
        rewardPoints++;
    }


    @Override
    public BigDecimal getAmount() {
        return this.balance;
    }
}
