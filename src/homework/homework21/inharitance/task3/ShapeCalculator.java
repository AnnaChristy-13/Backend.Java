package homework21.inharitance.task3;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(2.5);
        System.out.println("Area of circle: " + circle.calculateArea());

        Shape retangle = new Rectangle(5.6,18);
        System.out.println("Area of retanle: " + retangle.calculateArea());

        Shape triangle = new Triangle(25,65);
        System.out.println("Area of triangle: " + triangle.calculateArea());
    }
}
