public class Demo {
  public static void main(String[] args) {
    // Testing Point class
    Point p1 = new Point(2.5f, 3.8f);
    System.out.println("Point: " + p1);

    // Testing MovablePoint class
    MovablePoint mp1 = new MovablePoint(2.5f, 3.8f, 1.2f, 1.5f);
    System.out.println("Before move: " + mp1);
    mp1.move();
    System.out.println("After move: " + mp1);
  }
}

