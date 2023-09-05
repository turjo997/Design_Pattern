package Solid.Liskov.good;

import java.math.BigDecimal;

public class InvestmentAccount implements Account {

    private BigDecimal balance;
    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public BigDecimal getAmount() {
        return this.balance;
    }

    /*
     Now the problem solved
    */

}
