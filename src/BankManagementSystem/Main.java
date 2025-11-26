package BankManagementSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static int lastaccid = 0;
    private static ArrayList<Account> accounts;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        accounts = new ArrayList<>();
        Database database = new Database();
        accounts = database.getAccounts();
        lastaccid = accounts.size();

        int i = 0;

        try {
            System.out.println("\nWelcome to bank management system");
            System.out.println("1. Create new account");
            System.out.println("2. Login");
            System.out.print("Choose: ");

            i = scanner.nextInt();   // <- risk of InputMismatch
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number only.");
            return; // exit program safely
        }

        switch (i) {
            case 1:
                new CreateAccount(scanner, lastaccid, accounts, database);
                break;

            case 2:
                new Login(scanner, accounts,database);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
