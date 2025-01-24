public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account(5000.00);
        Account acc2 = new Account(4000.00);

        // Display balance
        System.out.println("Balance of Account 1: $" + acc1.getBalance());
        System.out.println("Balance of Account 2: $" + acc2.getBalance());

        // Transfer $1000 from account 1 to account 2
        System.out.println("\nTransferring $1000 from Account 1 to Account 2...");
        
        // Loading bar
        int totalSteps = 100; // Total steps for the loading bar
    
        for (int step = 0; step <= totalSteps; step++) {
            // Print the loading bar with progress percentage
            System.out.print("\r[" + "#".repeat(step / 2) + "-".repeat(50 - step / 2) + "] " + step + "%");
    
            // Simulate work by pausing the loop for a short time
            try {
                Thread.sleep(50); // Pause for 50 milliseconds
            } catch (InterruptedException e) {
                System.out.println("\nTransfer interrupted.");
                return;
            }
        }
        System.out.println("\nTransfer complete!");
        
        acc1.transfer(acc2, 1000.00);

        // Display final balances
        System.out.println("\nBalance of Account 1: $" + acc1.getBalance());
        System.out.println("Balance of Account 2: $" + acc2.getBalance());
    }
}

