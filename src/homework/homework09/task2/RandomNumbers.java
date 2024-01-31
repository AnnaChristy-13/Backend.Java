package homework09.task2;

public class RandomNumbers {

    public static void main(String[] args) {

        //Запишите в 4 переменные случайные числа от 0 до 100//

    int number1 = (int) (Math.random()*100);
    int number2 = (int) (Math.random()*100);
    int number3 = (int) (Math.random()*100);
    int number4 = (int) (Math.random()*100);

        //Выведите все 4 на экран//

        System.out.println("Random numbers:");
//      System.out.println("First number " + number1 +  " Second number "+ number2 +" Third number "+ number3 + " Forth number " + number4);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

        //Программа должна определить максимальное из этих четырех чисел//

        int maxNumber = Math.max(number1,Math.max(number2,Math.max(number3,number4)));

        //Результат вывести на экран//

        System.out.println("Maximal number is " + maxNumber);



    }
}

