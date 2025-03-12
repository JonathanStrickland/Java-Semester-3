public class Point {
    private float x;
    private float y;

    // Constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Default constructor
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Getter methods
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    // Setter Methods
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // To String method
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
