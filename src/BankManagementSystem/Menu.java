package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public Menu(Scanner scanner, Account acc, Database database, ArrayList<Account>accounts) {
        int j=0;
        do {
            System.out.println("\nWelcome " + acc.getFirstName() + " " + acc.getLastName());
            System.out.println("1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");
            j = scanner.nextInt();
            switch (j) {
                case 1:
                    new Deposit(scanner, acc);
                    break;
                case 2:
                    new Withdraw(scanner, acc);
                    break;
                case 3:
                    System.out.println("Your balance is: " + acc.getBalance());
                break;
                case 4:
                    database.saveAccounts(accounts);
                    scanner.close();

            }
        }while (j !=4);
    }
}
