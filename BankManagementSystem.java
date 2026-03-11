import java.util.Scanner;
class BankAccount {
    String name;
    int accNumber;
    double balance;
    void createAccount(String n, int acc, double bal) {
        name = n;
        accNumber = acc;
        balance = bal;
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } 
        else {
            System.out.println("Insufficient Balance");
        }
    }
    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: " + balance);
    }
}
public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();
        b.createAccount(name, acc, bal);
        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double dep = sc.nextDouble();
                    b.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    double wd = sc.nextDouble();
                    b.withdraw(wd);
                    break;
                case 3:
                    b.display();
                    break;
                case 4:
                    System.out.println("Thank you for using Bank System");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);
    }
}