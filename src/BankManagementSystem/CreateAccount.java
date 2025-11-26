package BankManagementSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateAccount {

    public CreateAccount(Scanner scanner, int lastaccid, ArrayList<Account>accounts, Database database){
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();
        System.out.print("Enter balance: ");
        double balance;
        try {
            balance = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid balance. Account creation cancelled.");
            scanner.next();
            return;
        }
        System.out.print("Enter passcode (digits only): ");
        int passcode = scanner.nextInt();
        System.out.print("Confirm passcode: ");
        int passcodec = scanner.nextInt();
        if (passcode != passcodec) {
            System.out.println("Passcodes not matching. Account creation cancelled.");
            return;
        }
        int id = 1000000 + lastaccid;
        lastaccid = lastaccid + 1;
        Account acc = new Account(firstName, lastName, id, balance, passcode);
        accounts.add(acc); // <-- add to list so login can find it
        System.out.println("Your account id: " + id);
        new Menu(scanner,acc, database, accounts);
    }
}
