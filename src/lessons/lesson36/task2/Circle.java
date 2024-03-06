package lesson36.task2;

public class Circle <T extends Number > implements Figure{

    private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    @Override
    public double figureArea() {

        return Math.PI * radius.doubleValue() * radius.doubleValue();
    }
}
