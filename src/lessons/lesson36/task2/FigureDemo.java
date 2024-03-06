package lesson36.task2;

public class FigureDemo {
    public static void main(String[] args) {

        Rectangle<Integer> rectangle = new Rectangle<>(150,45);

        double areaRectangle = rectangle.figureArea();
        System.out.println("Rectangle area = " + areaRectangle);


        Circle<Double> circle = new Circle<>(34.6);

        double areaCircle = circle.figureArea();
        System.out.println("Circle area = " + areaCircle);
    }

}
