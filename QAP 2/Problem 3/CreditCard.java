// Demonstrates the CreditCard class
class CreditCard {
    // Variables for balance, credit limit and card owner
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Initializes the card with an owner and credit limit
    public CreditCard(Person owner, Money limit) {
        this.owner = owner;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }

    // Gets the current balance
    public Money getBalance() {
        return balance;
    }

    // Gets the credit limits
    public Money getCreditLimit() {
        return creditLimit;
    }

    // Gets the owner's details
    public String getPersonals() {
        return owner.toString();
    }

    // For charges the amount if it doesnt exceed the credit limit
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
        } else {
            System.out.println("Charge denied: Exceeds credit limit");
        }
    }

    // For making a payment and reducing the balance
    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
}


