public class Demo {
    // Method to scale an array of Scalable objects
    public static void scaleShapes(Scalable[] objects, float factor) {
        System.out.println("\nScaling shapes by a factor of " + factor + "...\n");
        for (Scalable obj : objects) {
            System.out.println("Before scaling: " + obj);
            obj.scale(factor);
            System.out.println("After scaling: " + obj);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating scalable shapes
        Circle circle = new Circle(5);
        Ellipse ellipse = new Ellipse(7, 4);
        Triangle triangle = new Triangle(3, 4, 5);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(6);

        // Storing in an array of type Scalable
        Scalable[] shapes = {circle, ellipse, triangle, equilateralTriangle};

        // Print original shapes
        System.out.println("Original Shapes:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        // Scale all shapes by a factor of 2
        scaleShapes(shapes, 2.0f);
    }
}

