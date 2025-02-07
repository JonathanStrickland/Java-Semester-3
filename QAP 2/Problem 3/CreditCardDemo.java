// Demonstrates the CreditCard class
public class CreditCardDemo {
    public static void main(String[] args) {
        // Sets credit limit and amounts for charges and payments
        final Money LIMIT = new Money(1000.00);
        final Money FIRST_AMOUNT = new Money(200.00);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25.00);
        final Money FOURTH_AMOUNT = new Money(990.00);

        // Create a person object to be the credit card owner
        Person owner = new Person("Diane", "Christie", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));

        // Create a credit card object with owner and credit limit
        CreditCard visa = new CreditCard(owner, LIMIT);

        // Print out the credit card owner's details, balance, and credit limit
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());

        // First charge
        System.out.println("Attempt to charge " + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        // Second charge
        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        // Thrid payment
        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        visa.payment(THIRD_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        // Forth charge
        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
    }
}

