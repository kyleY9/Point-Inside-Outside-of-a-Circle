import java.util.Scanner;

public class PointInCircleRunner {
    public static Point stringInputToPoint(String str) { 
         // format (double, double)
        double x = Double.parseDouble(str.substring(1, str.indexOf(",")));
        double y = Double.parseDouble(str.substring(str.indexOf(",") + 1, str.indexOf(")")));
        return new Point(x, y);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hiya! This program will tell you whether a point is inside or outside a circle!");
        System.out.print("Please enter the center of your circle in format: (double, double) ");
        Point center = stringInputToPoint(scan.nextLine());
        System.out.println("I've constructed the point for you: " + center);
        System.out.print("Now please enter the radius: ");
        double radius = scan.nextDouble();
        scan.nextLine();
        System.out.println("radius = " + radius);
        Circle circle = new Circle(center, radius);
        System.out.println("I've made a circle with center " + center + " and radius " + radius);
        System.out.print("Now, type in a point and I'll see if it's inside or outside of the circle: ");
        Point point1 = stringInputToPoint(scan.nextLine());

        if (circle.isInside(point1)) {
            System.out.println("The point " + point1 + " is inside the circle.");
        } else {
            System.out.println("The point " + point1 + " is outside of the circle.");
        }

        System.out.print("Give me another one! ");
        Point point2 = stringInputToPoint(scan.nextLine());

        if (circle.isInside(point2)) {
            System.out.println("The point " + point2 + " is inside the circle.");
        } else {
            System.out.println("The point " + point2 + " is outside of the circle.");
        }
    }
}