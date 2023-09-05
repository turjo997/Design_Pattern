package Solid.Liskov.good;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BankingAppWithdrawalService bankingAppWithdrawalService =
                new BankingAppWithdrawalService(BigDecimal.valueOf(100000));

        bankingAppWithdrawalService.withdraw(BigDecimal.valueOf(1000));

        System.out.println(bankingAppWithdrawalService.getAmount());

        bankingAppWithdrawalService.deposit(BigDecimal.valueOf(200000));

        System.out.println(bankingAppWithdrawalService.getAmount());
    }
}
