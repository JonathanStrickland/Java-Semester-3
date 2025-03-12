public class Circle extends Shape implements Scalable {
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

  // Implement scale method
  public void scale(float factor) {
    radius *= factor;
  }

  // To String method
  public String toString() {
    return super.toString() + ", Radius: " + radius + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
  }
}
