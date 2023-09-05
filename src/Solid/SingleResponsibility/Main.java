package Solid.SingleResponsibility;

import java.math.BigDecimal;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Account account = new Account();

        account.setAccountNumber(123);
        account.setFirstName("Vishrut");
        account.setTotalAmount(BigDecimal.valueOf(100000));

        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(123),123);


        // Retrieve an account using getAccount
        int accountNumberToRetrieve = 123; // Replace with the desired account number
        Account retrievedAccount = accountOperations.getAccount(accountNumberToRetrieve);


        if (retrievedAccount != null) {
            System.out.println("Account Details:");
            System.out.println("Account Number: " + retrievedAccount.getAccountNumber());
            System.out.println("Account Holder: " + retrievedAccount.getFirstName());
            System.out.println("Total Amount: " + retrievedAccount.getTotalAmount());
        } else {
            System.out.println("Account not found.");
        }

        account.setAccountNumber(123);
        account.setTotalAmount(BigDecimal.valueOf(200000));
        accountOperations.updateAccount(account);

        System.out.println("Total Amount: " + retrievedAccount.getTotalAmount());


    }
}
