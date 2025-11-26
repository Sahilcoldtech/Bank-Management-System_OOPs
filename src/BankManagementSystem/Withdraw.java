package BankManagementSystem;

import java.util.Scanner;

public class Withdraw {

    public Withdraw(Scanner scanner, Account acc) {

        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        if (amount > acc.getBalance()) {
            System.out.println("Insufficient balance");
            return;
        }
        acc.setBalance(acc.getBalance() - amount);
        System.out.println("Operation done successfully");
    }
}
