//Create a class "Shape" containing two parameterized constructors
//"Shape" which will calculate the area of a circle and area of triangle respectively.
// Call the constructors from the main method based on the number of parameters.
public class Shape {
    private double area;
    // Private constructor to prevent direct instantiation
    private Shape(double area) {
        this.area = area;
    }
    // Factory method for creating a circle
    public static Shape createCircle(double radius) {
        return new Shape(Math.PI * radius * radius);
    }
    // Factory method for creating a triangle
    public static Shape createTriangle(double base, double height) {
        return new Shape(0.5 * base * height);
    }
    // Method to get the calculated area
    public double getArea() {
        return area;
    }
    public static void main(String[] args) {
        // Create a circle object
        Shape circle = Shape.createCircle(5.0);
        System.out.println("Area of circle: " + circle.getArea());

        // Create a triangle object
        Shape triangle = Shape.createTriangle(4.0, 6.0);
        System.out.println("Area of triangle: " + triangle.getArea());
    }
}
