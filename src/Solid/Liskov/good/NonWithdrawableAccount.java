package Solid.Liskov.good;

import java.math.BigDecimal;

public interface NonWithdrawableAccount extends Account {
    public void withdraw(BigDecimal amount);
}
