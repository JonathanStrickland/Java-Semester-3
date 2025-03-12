public class Ellipse extends Shape {
  private double majorAxis;
  private double minorAxis;

  // Constructor
  public Ellipse(double a, double b) {
    super("Ellipse");
    if (a >= b) {
      this.majorAxis = a;
      this.minorAxis = b;
    } else {
      this.majorAxis = b;
      this.minorAxis = a;
    }
  }

  // Get area method
  public double getArea() {
    return Math.PI * majorAxis * minorAxis;
  }

  // Get perimeter method
  public double getPerimeter() {
    return Math.PI * (3 * (majorAxis + minorAxis) - Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis)));
  }

  // To String method
  public String toString() {
    return super.toString() + ", Major Axis: " + majorAxis + ", Minor Axis: " + minorAxis + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
  }
}