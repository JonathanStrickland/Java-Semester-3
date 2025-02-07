public class MyLine {
    private MyPoint begin;
    private MyPoint end; // Endpoints of the line

    // Initializes the line use begin and end
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Initializes the line using x and y
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }
    
    // Gets the starting point of the line
    public MyPoint getBegin() { 
        return begin; 
    }

    // Sets the starting point of the line
    public void setBegin(MyPoint begin) { 
        this.begin = begin; 
    }
    
    // Gets the ending point of the line
    public MyPoint getEnd() { 
        return end; 
    }

    // Sets the ending point of the line
    public void setEnd(MyPoint end) { 
        this.end = end; 
    }

    // Gets the x coordinate of the starting point
    public int getBeginX() { 
        return begin.getX(); 
    }

    // Sets the x coordinate of the starting point
    public void setBeginX(int x) { 
        begin.setX(x); 
    }

    // Gets the y coordinate of the starting point
    public int getBeginY() { 
        return begin.getY(); 
    }

    // Sets the y coordinate of the starting point
    public void setBeginY(int y) { 
        begin.setY(y); 
    }

    // Gets the x coordinate of the ending point
    public int getEndX() { 
        return end.getX(); 
    }

    // Sets the x coordinate of the ending point
    public void setEndX(int x) { 
        end.setX(x); 
    }

    // Gets the y coordinate of the ending point
    public int getEndY() { 
        return end.getY(); 
    }

    // Sets the y coordinate of the ending point
    public void setEndY(int y) { 
        end.setY(y); 
    }

    // Gets the x and y coordinates of the beginning point as an array
    public int[] getBeginXY() { 
        return begin.getXY(); 
    }

    // Sets the x and y coordinates of the beginning point
    public void setBeginXY(int x, int y) { 
        begin.setXY(x, y); 
    }

    // Gets the x and y coordinates of the ending point as an array
    public int[] getEndXY() { 
        return end.getXY(); 
    }

    // Sets the x and y coordinates of the ending point
    public void setEndXY(int x, int y) { 
        end.setXY(x, y); 
    }

    // Calculates and returns the length of the line
    public double getLength() {
        return begin.distance(end);
    }

    // Calculates and returns the gradient of the line
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    // Returns the line in "MyLine[begin=(0, 0), end=(0, 0)]" format
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}