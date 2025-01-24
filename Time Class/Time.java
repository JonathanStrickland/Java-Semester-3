public class Time {
    private int hour;
    private int minute;
    private int second;

    // Initialize time
    public Time(int hour, int minute, int second) {
        if (isValidTime(hour, minute, second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    // Validate time
    private boolean isValidTime(int hour, int minute, int second) {
        return hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60;
    }

    // Count time up by one second
    public void nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
    }

    // Count time down by one second
    public void previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute++;
            if (minute < 0) {
                minute = 59;
                hour++;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
    }

    // Return the time in "HR/MIN/SEC"
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}