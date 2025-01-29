// File: GeometryCalculator.java
public class GeometryCalculator {
    // Final constant for unit conversion (cm² to m²)
    private static final double CM_TO_M_CONVERSION = 0.0001;

    // Method to calculate area of a rectangle
    public double computeRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a square
    public double computeSquareArea(double side) {
        return side * side;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of GeometryCalculator
        GeometryCalculator calculator = new GeometryCalculator();

        // Rectangle dimensions
        double length = 12.0;
        double width = 7.0;
        double rectangleArea = calculator.computeRectangleArea(length, width);
        System.out.println("Area of Rectangle: " + rectangleArea + " cm² (" + (rectangleArea * CM_TO_M_CONVERSION) + " m²)");

        // Square dimensions
        double side = 5.0;
        double squareArea = calculator.computeSquareArea(side);
        System.out.println("Area of Square: " + squareArea + " cm² (" + (squareArea * CM_TO_M_CONVERSION) + " m²)");
    }
}
