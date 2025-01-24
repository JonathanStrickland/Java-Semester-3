public class Date {
    private int day;
    private int month;
    private int year;

    // Initialize date
    public Date(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            // Defaults to 01/01/2000 if invalid
            this.day = 1;
            this.month = 1;
            this.year = 2000;
        }
    }

    // Validate the date
    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12 || day < 1 || year < 0) {
            return false;
        }
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        return day <= daysInMonth[month - 1];
    }

    // Check if its a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Return the date in "DD/MM/YYYY"
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}