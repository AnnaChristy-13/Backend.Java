package homework20.shape;

public class Circle {
    private String title;
    private double radius;

    public Circle(String title, double radius) {
        this.title = title;
        this.radius = radius;
    }

    public double calculatorArea(){
        return Math.PI * radius * radius;
    }
    public double calculatorPerimeter(){
        return 2* Math.PI * radius;
    }
}
