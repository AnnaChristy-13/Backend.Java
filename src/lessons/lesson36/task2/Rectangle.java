package lesson36.task2;

public class Rectangle<T extends Number> implements Figure {

    T side1;

    T side2;

    public Rectangle(T side1, T side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double figureArea() {
        return (side1.doubleValue()* side2.doubleValue());
    }
}
