package homework14.task5;

public class Pen {
//1. Создайте класс ручка (Pen)
//    a. Определите свойство color типа String с доступом private
//    b. Создайте методы getColor(); setColor(String newColor);
//2. Создайте класс PenDemo (метод main)
//3. Создайте три объекта типа Pen
//4. Создайте массив L = 3
//5. Сохраните все объекты в массив
//6. Достаньте поочередно из массива ручки и измените цвет каждой на
//    a. “Green”
//    b. “Red”
//    c. “Black”
//7. Распечатайте цвета ручек из массива


//    Определили свойство color типа String с доступом private

    private String color;

    public Pen(String color) {
        this.color = color;
    }
//    Создали методы getColor(); setColor(String newColor)

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                '}';
    }
}


