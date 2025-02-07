// Defines an address using a street, city, state, and zipcode
class Address {
    // Variables for street, city, state and zip code
    private String street; 
    private String city;
    private String state;
    private String zip;

    // Initializes the address
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Add commas and spaces to the address output
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}