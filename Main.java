//Create a class containing two methods for calculation of area of a circle and area of
// triangle. Take the dimensions of the circle and triangle from the main method by creating
// instance of the. Use final to declare value of рі (п).
class AreaCalculator {
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        double circleRadius = 5.0;  // Fixed variable declaration
        double circleArea = calculator.calculateCircleArea(circleRadius);
        System.out.println("Area of circle: " + circleArea);

        double triangleBase = 4.0;
        double triangleHeight = 6.0;
        double triangleArea = calculator.calculateTriangleArea(triangleBase, triangleHeight);
        System.out.println("Area of triangle is: " + triangleArea);
    }
}
