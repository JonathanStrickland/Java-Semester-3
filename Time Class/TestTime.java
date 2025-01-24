public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Initial time
        System.out.println("Time T1: " + t1);
        System.out.println("Time T2: " + t2);

        // Count up T1
        t1.nextSecond();
        System.out.println("Time T1 (Count up): " + t1);

        // Count Down T2
        t2.previousSecond();
        System.out.println("Time T2 (Count Down): " + t2);
    }
}