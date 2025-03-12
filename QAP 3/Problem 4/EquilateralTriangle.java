public class EquilateralTriangle extends Triangle {

  // Constructor
  public EquilateralTriangle(double side) {
    super(side, side, side);
  }

  // To String method
  public String toString() {
    return super.toString() + " (Equilateral)";
  }
}
