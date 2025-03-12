public abstract class Shape {
  protected String name;

  // Constructor
  public Shape(String name) {
    this.name = name;
  }

  // Methods for area and perimeter
  public abstract double getArea();
  public abstract double getPerimeter();

  // Getter for name
  public String getName() {
    return name;
  }

  // To String method
  public String toString() {
    return "Shape: " + name;
  }
}