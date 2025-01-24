public class TestDate {
    public static void main(String[] args) {
        
        // Valid date
        Date date1 = new Date(20, 1, 2025);
        System.out.println("Valid Date: " + date1);

        // Invalid date
        Date date2 = new Date(30, 2, 2025);
        System.out.println("Invalid Date (Defaulting...): " + date2);

        // Leap year
        Date leapYearDate = new Date(29, 2, 2024);
        System.out.println("Leap Year Date: " + leapYearDate);
    }
}
