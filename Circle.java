public class Circle {
    // instance variables
    private Point center;
    private double radius;

    // constructor
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // getter/setter methods
    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    // other public methods
    public boolean isInside(Point p) {
        return distance(p) < radius;
    }
}