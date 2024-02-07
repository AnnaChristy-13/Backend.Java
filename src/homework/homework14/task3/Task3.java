package homework14.task3;
//1. Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//2. Подсчитайте сколько в массиве чётных элементов и выведете это
//количество на экран на отдельной строке.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        Task3Demo arrayDemo = new Task3Demo();
//    Вызываем метод createArrays и выводим массив в консоль.

        int[] myArray = arrayDemo.createArrays();
        System.out.println(Arrays.toString(myArray));

//Вызываем метод evenNumberCounter для подсчета количества четных чисел в массиве и выведения его в консоль.

        arrayDemo.evenNumbersCounter();

    }

}











