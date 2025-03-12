public class Demo {
  public static void main(String[] args) {
    // Creating objects and printing them
    Person bob = new Person("Bob Ross", 27, "M");
    System.out.println(bob);

    Student alice = new Student("Alice Smith", 16, "F", "HS95129", 3.5);
    System.out.println(alice);

    Teacher mrNolan = new Teacher("John Nolan", 34, "M", "Computer Science", 50000);
    System.out.println(mrNolan);

    CollegeStudent lucy = new CollegeStudent("Lucy Chen", 18, "F", "LC123", 4.0, 1, "English");
    System.out.println(lucy);
  }
}