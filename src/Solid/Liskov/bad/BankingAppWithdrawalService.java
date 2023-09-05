package Solid.Liskov.bad;

import java.math.BigDecimal;

public class BankingAppWithdrawalService implements Account {
    private BigDecimal balance;
    public BankingAppWithdrawalService(BigDecimal initialBalance) {
        this.balance = initialBalance;
    }
    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }
    @Override
    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }
}
