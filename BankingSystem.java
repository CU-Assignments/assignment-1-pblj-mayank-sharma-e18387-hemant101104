class Account {
    private String name;
    private int accountNumber;
    private double balance;

    // Constructor
    public Account(String name, int accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdrawal method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // Create an account
        Account account = new Account("John Doe", 12345, 1000);

        // Deposit and withdraw operations
        account.deposit(500);  // Deposit: 500
        account.withdraw(2000); // Withdraw: 2000
    }
}
