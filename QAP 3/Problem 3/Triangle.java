public class Triangle extends Shape {
  private double side1, side2, side3;

  // Constructor
  public Triangle(double side1, double side2, double side3) {
    super("Triangle");
    if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    } else {
      throw new IllegalArgumentException("Invalid triangle sides.");
    }
  }

  // Get area method
  public double getArea() {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  // Get perimeter method
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  // To String method
  public String toString() {
    return super.toString() + ", Sides: (" + side1 + ", " + side2 + ", " + side3 + "), Area: " + getArea() + ", Perimeter: " + getPerimeter();
  }
}