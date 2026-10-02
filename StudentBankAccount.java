import java.util.Scanner;

class StudentBankAccount {
    private String studentName;
    private String studentID;
    private String accountNumber;
    private double balance;
    private static final double INTEREST_RATE = 5.0; // annual interest rate

    public StudentBankAccount(String studentName, String studentID, String accountNumber, double initialDeposit) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
            System.out.println("Current Balance: ₹" + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful.");
                System.out.println("Current Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than 0.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void displayDetails() {
        System.out.println("========== ACCOUNT DETAILS ==========");
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentID);
        System.out.println("Account No   : " + accountNumber);
        System.out.println("Balance      : ₹" + balance);
    }

    public void calculateInterest(int years) {
        if (years > 0) {
            double interest = (balance * INTEREST_RATE * years) / 100;
            double newBalance = balance + interest;
            System.out.println("Interest Earned: ₹" + interest);
            System.out.println("New Balance (with interest): ₹" + newBalance);
        } else {
            System.out.println("Years must be greater than 0.");
        }
    }
}

public class StudentBankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== STUDENT BANK SYSTEM ==========");
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Initial Deposit: ");
        double initialDeposit = sc.nextDouble();

        if (initialDeposit <= 0) {
            System.out.println("Initial deposit must be greater than 0. Exiting...");
            sc.close();
            return;
        }

        StudentBankAccount account = new StudentBankAccount(name, id, accNo, initialDeposit);
        System.out.println("Account created successfully!");

        int choice;
        do {
            System.out.println("\n========== STUDENT BANK SYSTEM ==========");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.displayDetails();
                    break;
                case 5:
                    System.out.print("Enter number of years: ");
                    int years = sc.nextInt();
                    account.calculateInterest(years);
                    break;
                case 6:
                    System.out.println("Thank you for using Student Bank System!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}