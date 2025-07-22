package practice;
import java.util.Scanner;

public class project1 {
    private double balance;
    private Scanner scanner;

    public project1() {
        balance = 2000.00;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\n=== ATM Menu ===");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    public void deposit() {
        System.out.print("Enter amount to deposit: ₹");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
            System.out.println("Updated balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
            System.out.println("Remaining balance: ₹" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public static void main(String[] args) {
        project1 atm = new project1();

        while (true) {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = atm.scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;  // Exit the loop and end the program
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
