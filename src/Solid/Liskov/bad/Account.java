package Solid.Liskov.bad;

import java.math.BigDecimal;

public interface Account {
      public void deposit(BigDecimal amount);
      public void withdraw(BigDecimal amount);
}
