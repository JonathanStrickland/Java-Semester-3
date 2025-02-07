public class MyPoint {
    private int x, y; // Variable to store x and y coordinates

    // Initializes the point at the origin
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Initializes the point with the given x and y value
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Get for x
    public int getX() { 
        return x; 
    }

    // Set for x
    public void setX(int x) { 
        this.x = x; 
    }

    // Get for y
    public int getY() { 
        return y; 
    }

    // Set for y
    public void setY(int y) { 
        this.y = y; 
    }

    // Get for xy
    public int[] getXY() {
        return new int[]{x, y};
    }

    // Set for xy
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Calculates the distance
    public double distance(MyPoint other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    // Return the points in (x, y) format
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}