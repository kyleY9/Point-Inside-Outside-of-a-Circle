public class Point {
    // instance variables
    private double x;
    private double y;

    // constructors
    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double setX, double setY) {
        x = setX;
        y = setY;
    }

    // getter/setter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double setX) {
        x = setX;
    }

    public void setY(double setY) {
        y = setY;
    }

    // other public methods
    public double distance(Point other) {
        return Math.sqrt(Math.pow(other.getX() - getX(), 2) + Math.pow(other.getY() - getY(), 2));
    }

    public boolean equals(Point other) {
        return (getX() == other.getX()) && (getY() == other.getY());
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
}