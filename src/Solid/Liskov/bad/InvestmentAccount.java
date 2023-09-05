package Solid.Liskov.bad;

import java.math.BigDecimal;

public class InvestmentAccount implements Account{

    private BigDecimal balance;
    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }
    @Override
    public void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException("Withdrawal is not supported");
    }


    /*
      In this case, the InvestmentAccount class violates LSP because
      it throws an exception in the withdraw method, which is not defined
      in the superclass Account. A potential solution could be to create a
      new class NonWithdrawableAccount that extends Account and move the
      withdraw method into this class. Then, InvestmentAccount can extend
      NonWithdrawableAccount, and this way, the Liskov Substitution Principle
      is not violated.
     */

}
