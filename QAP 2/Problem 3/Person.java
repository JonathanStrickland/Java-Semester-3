// Defines a person by name and address
class Person {
    // Variables for first name, last name and address
    private String firstName;
    private String lastName;
    private Address home;

    // Initialize a person with first name, last name and address
    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    // Return the person's details
    public String toString() {
        return firstName + " " + lastName + "\n" + home;
    }
}