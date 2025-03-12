public class Circle extends Shape {
  private double radius;

  // Constructor
  public Circle(double radius) {
    super("Circle");
    this.radius = radius;
  }

  // Get area method
  public double getArea() {
    return Math.PI * radius * radius;
  }

  // Get perimeter method
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  // To String method
  public String toString() {
    return super.toString() + ", Radius: " + radius + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
  }
}