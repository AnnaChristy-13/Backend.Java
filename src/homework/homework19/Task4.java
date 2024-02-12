package homework19;

//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
//Выведите массивы на экран в двух отдельных строках
//Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)

import java.util.Arrays;

public class Task4 {

//    Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
//    Выведите массивы на экран в двух отдельных строках
//    Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//    для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)

    public static void main(String[] args) {

        Task4Demo myArrays = new Task4Demo();

//        Вызываем метод createArrays и createArrays1 и выводим оба массива в консоль.

        int [] createdArrays = myArrays.createArrays();
        int [] createdArrays1 = myArrays.createArrays1();
        System.out.println(Arrays.toString(createdArrays));
        System.out.println(Arrays.toString(createdArrays1));

//        Вызываем метод averageAndCompareArray для сортировки массива по убыванию и выведения его в консоль.

        myArrays.averageAndCompareArray();


    }
}
