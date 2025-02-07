public class TestMyRectangle {
    public static void main(String[] args) {
        // Create two MyPoint objects
        MyPoint p1 = new MyPoint(1, 5);  // Top-left corner
        MyPoint p2 = new MyPoint(6, 1);  // Bottom-right corner

        // Create a MyRectangle object using two MyPoint instances
        MyRectangle rect1 = new MyRectangle(p1, p2);
        System.out.println("Rectangle 1: " + rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        // Create a MyRectangle object using x1, y1, x2, y2
        MyRectangle rect2 = new MyRectangle(2, 8, 7, 3);
        System.out.println("Rectangle 2: " + rect2);
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}
