package Solid.Liskov.good;

import java.math.BigDecimal;

public interface Account {
      public void deposit(BigDecimal amount);

      public BigDecimal getAmount();

}
