public class Account {
    private double balance;

    // Initialize balance
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance can't be negative.");
            this.balance = 0.0;
        }
    }

    // Get the current balance
    public double getBalance() {
        return balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdraw amount must be a positive number and no more than the available balance.");
            return false;
        }
    }

    // Transfer money
    public boolean transfer(Account toAccount, double amount) {
        if (this.withdraw(amount)) {
            toAccount.deposit(amount);
            return true;
        } else {
            System.out.println("Transfer failed.");
            return false;
        }
    }
}