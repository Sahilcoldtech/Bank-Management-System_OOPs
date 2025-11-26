# Project Details
Bank Management System implemented using Object-Oriented Programming (OOP) concepts in Java.
This project demonstrates real-world OOP usage such as encapsulation, inheritance, polymorphism, abstraction, and file handling to manage bank accounts efficiently.

## Account Operations
Create a new bank account
Deposit money
Withdraw money
Check balance
Display account details
Persistent Storage
Data is stored using file handling (.txt or serialized objects)
Accounts remain saved even after the program stops

## OOP Concepts Used
Concept	Usage
Class & Objects	Account, Database, Bank classes
Encapsulation	Private fields with public getters/setters
Inheritance	(If used) Different account types like SavingAccount/CurrentAccount
Polymorphism	Method overriding for different behaviors
Abstraction	Abstract classes or interface (if implemented)
File Handling	Storing and retrieving accounts
Collections	ArrayList for storing accounts
 Tech Stack

## Java 8+
OOP Principles
File Handling (I/O Streams)
Collections Framework

📂 Project Structure (Example)
BankManagementSystem/
│
├── Account.java
├── Bank.java
├── Database.java
├── Main.java
└── Files/
    └── Data

## How It Works
The user interacts through a menu-driven console interface
Account details are stored inside a file using the Database class
The system loads all saved accounts at startup
All operations like deposit/withdraw update the data file
Clean OOP architecture ensures modular and understandable code

Sample Output
Welcome to Bank Management System
1. Create Account
2. Deposit
3. Withdraw
4. Check Balance
5. Display Account Details
6. Exit
Enter your choice:

 Future Enhancements
Add Savings & Current account types
Add interest calculation
Add login system for users
Convert to GUI (JavaFX / Swing)
Convert to REST API (Spring Boot)

## Author
Sahil Mayekar (Sahilcoldtech)
Java Enthuisat | OOPs | Backend
