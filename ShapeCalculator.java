// Create a class containing static variables and static methods to calculate area
// of a circle and area of triangle respectively.Call the static methods from the main method.
public class ShapeCalculator {
    // Static variables to store area values
    static double circleArea;
    static double triangleArea;

    // Static method to calculate area of a circle
    public static void calculateCircleArea(double radius) {
        circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + circleArea);
    }

    // Static method to calculate area of a triangle
    public static void calculateTriangleArea(double base, double height) {
        triangleArea = 0.5 * base * height;
        System.out.println("Area of Triangle: " + triangleArea);
    }

    public static void main(String[] args) {
        // Call static methods without creating an object
        calculateCircleArea(5.0);
        calculateTriangleArea(4.0, 6.0);
    }
}
