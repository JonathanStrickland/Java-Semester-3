public class Demo {
  public static void main(String[] args) {
    // Creating shapes
    Shape circle = new Circle(5);
    Shape ellipse = new Ellipse(7, 4);
    Shape triangle = new Triangle(3, 4, 5);
    Shape equilateralTriangle = new EquilateralTriangle(6);

    // Storing in an array and printing results
    Shape[] shapes = {circle, ellipse, triangle, equilateralTriangle};

    for (Shape shape : shapes) {
      System.out.println(shape);
    }
  }
}
