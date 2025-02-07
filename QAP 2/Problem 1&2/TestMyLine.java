public class TestMyLine {
    public static void main(String[] args) {
        // Create two MyPoint objects showing the x and y points of the line
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // Create a MyLine object using the MyPoints object
        MyLine line = new MyLine(p1, p2);

        // Outputs the Line, Length and Gradient
        System.out.println("Line: " + line);
        System.out.println("Line Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());
    }
}
