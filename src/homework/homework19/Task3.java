package homework19;

//Создайте массив из 8 случайных целых чисел из отрезка [1;10]
//Отсортируйте массив по убыванию любым из алгоритмов.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        Task3Demo randomArray = new Task3Demo();

//      Вызываем метод createArrays и выводим массив в консоль.

        int[] arrayForSort = randomArray.createArrays();
        System.out.println("Random array before sort:");
        System.out.println(Arrays.toString(arrayForSort));

//      Вызываем метод sortArray для сортировки массива по убыванию и выведения его в консоль.

        randomArray.sortArray();
    }
}
