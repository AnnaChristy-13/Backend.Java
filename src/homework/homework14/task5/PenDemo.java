package homework14.task5;

//2. Создали класс PenDemo (метод main)
public class PenDemo {
    public static void main(String[] args) {

//3. Создайте три объекта типа Pen

        Pen pen1 = new Pen(" ");
        Pen pen2 = new Pen(" ");
        Pen pen3 = new Pen(" ");

//  4. Создали массив L = 3;
//  5. Сохраните все объекты в массив

        Pen[] pens ={pen1,pen2,pen3};

//    6. Достали поочередно из массива ручки и изменили цвет каждой на
//    a. “Green”
//    b. “Red”
//    c. “Black”


        System.out.println("Color of the first pen :" + pens[0].getColor());
        System.out.println("Color of the second pen :" + pens[1].getColor());
        System.out.println("Color of the third pen :" + pens[2].getColor());

        pens[0].setColor("green");
        pens[1].setColor("red");
        pens[2].setColor("black");

        System.out.println("Changed color of first  " + pens[0]);
        System.out.println("Changed color of second book  " + pens[1]);
        System.out.println("Changed color of third book  " + pens[2]);


////        System.out.println("Changed color of the first pen :" + pens[0].setColor("black"));
//        System.out.println("______________________________________");
//
////        System.out.println("Changed color of the second pen :" + pens[1].setColor());
//        System.out.println("______________________________________");
//
////        System.out.println("Changed color of the first pen :" + pens[2].setColor());






    }
}
