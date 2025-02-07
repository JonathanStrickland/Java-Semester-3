public class MyRectangle {
    private MyPoint topLeft; // Top left of rectangle
    private MyPoint bottomRight; // Bottom right of rectangle

    // Initializes the top left and bottom right
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Takes coordinates for top left and bottom right corners
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Gets the top left point of the rectangle
    public MyPoint getTopLeft() {
        return topLeft; 
    }

    // Sets the top left point of the rectangle
    public void setTopLeft(MyPoint topLeft) { 
        this.topLeft = topLeft; 
    }

    // Gets the bottom right point of the rectangle
    public MyPoint getBottomRight() { 
        return bottomRight; 
    }

    // Sets the bottom right point of the rectangle
    public void setBottomRight(MyPoint bottomRight) { 
        this.bottomRight = bottomRight; 
    }

    // Gets the top left x coordinate
    public int getTopLeftX() { 
        return topLeft.getX(); 
    }

    // Sets the top left x coordinate
    public void setTopLeftX(int x) { 
        topLeft.setX(x); 
    }

    // Gets the top left y coordinate
    public int getTopLeftY() { 
        return topLeft.getY(); 
    }

    // Sets the top left y coordinate
    public void setTopLeftY(int y) { 
        topLeft.setY(y); 
    }

    // Gets the bottom right x coordinate
    public int getBottomRightX() { 
        return bottomRight.getX(); 
    }

    // Sets the bottom right x coordinate
    public void setBottomRightX(int x) { 
        bottomRight.setX(x); 
    }

    // Gets the bottom right y coordinate
    public int getBottomRightY() { 
        return bottomRight.getY(); 
    }

    // Sets the bottom right y coordinate
    public void setBottomRightY(int y) { 
        bottomRight.setY(y); 
    }

    // Calculates and returns the width of the rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Calculates and returns the height of the rectangle
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Calculates and returns the area of the rectangle
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Calculates and returns the perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Returns the line in "MyRectangle[topLeft=(0, 0), bottomRight=(0, 0), width=0, height=0]" format
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + ", width=" + getWidth() + ", height=" + getHeight() + "]";
    }
}
