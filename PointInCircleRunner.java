import java.util.Scanner;

public class PointInCircleRunner {
    public static Point stringInputToPoint(String str) {  // format (double, double)
        double x = Integer.parseInt(str.substring(1, str.indexOf(","));)
        double y = Integer.parseInt(str.substring(str.indexOf(",") + 1, str.indexOf(")")));
        Point p = new Point(x, y);
        return p;
    }

    public static void main(String[] args) {
        System.out.println("Hiya! This program will tell you whether a point is inside or outside a circle!");
        System.out.println("Please enter the center of your circle in format: (double, double) ");
        Point center = stringInputToPoint(scan.nextLine());
        System.out.println("I've constructed the point for you: " + center);
        System.out.println("Now please enter the radius: ");
        double radius = scan.nextDouble();
        System.out.println("radius = " + radius);
        Circle circle = new Circle(center, radius);
        System.out.println("I've made a circle with center " + center + " and radius " + radius);
        System.out.println("Now, type in a point and I'll see if it's inside or outside of the circle: ");
        Point point1 = stringInputtoPoint(scan.nextLine());

        if (point1.isInside) {
            System.out.println("The point " + point1 + " is inside the circle.");
        } else {
            System.out.println("The point " + point1 + " is outside of the circle.")
        }

        System.out.println("Give me another one! ");
        Point point2 = stringInputToPoint(scan.nextLine());

        if (point2.isInside) {
            System.out.println("The point " + point2 + " is inside the circle.");
        } else {
            System.out.println("The point " + point2 + " is outside of the circle.")
        }


    }
}