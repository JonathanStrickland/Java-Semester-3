public class Money {
    // Variables to store dollars and cents amount
    private long dollars;
    private long cents;

    // Creates money from a double value
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    // Creates money from an integer amount in dollars
    public Money(int amount) {
        this((double) amount);
    }

    // Creates a copy of Money object
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Adds Money objects
    public Money add(Money other) {
        long totalCents = this.toCents() + other.toCents();
        return fromCents(totalCents);
    }

    // Subtracts Money objects
    public Money subtract(Money other) {
        long totalCents = this.toCents() - other.toCents();
        return fromCents(totalCents);
    }

    // Compares to Money objects
    public int compareTo(Money other) {
        return Long.compare(this.toCents(), other.toCents());
    }

    // Checks if two Money objects are equal
    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    // Converts Money to total cents
    private long toCents() {
        return dollars * 100 + cents;
    }

    // Converts cents back to Money
    private Money fromCents(long totalCents) {
        return new Money(totalCents / 100.0);
    }

    // Returns Money in "$#.##" format
    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" : "") + cents;
    }
}

