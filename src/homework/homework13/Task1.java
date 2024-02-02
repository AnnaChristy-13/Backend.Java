package homework13;

//        1.    Создайте массив из 8 случайных целых чисел из интервала [1;50]
//        2.	Выведите массив на консоль в строку.
//        3.	Замените каждый элемент с нечетным индексом на ноль.
//        4.	Снова выведете массив на консоль в отдельной строке.

public class Task1 {

    public static void main(String[] args) {
        int array []  = new int[8];
        for (int i = 0; i < array.length; i++) {
            array [i] = (int)(Math.random()*51);
            System.out.println(array[i]);
        }


    }
    }



