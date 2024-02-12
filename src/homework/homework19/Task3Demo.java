package homework19;

import java.util.Arrays;

public class Task3Demo {
    int arrayForSort[] = new int[8];

//1. Создаем метод для создания массива из случайных чисел.

    public int [] createArrays() {
        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = (int) (Math.random() * 10)+1;

        }
        return arrayForSort;
}
//2.Создаем метод для сортировки массива пузырьковым методом по убыванию.

    public void sortArray() {
        boolean notSorted = true;
        int temp;
        while (notSorted) {
            notSorted = false;

            for (int i = 0; i < arrayForSort.length - 1; i++) {

//Чтобы сортировка массива была не по возрастанию, а по убыванию условаия в операторе if меняем чтобы индекс текущего
//элемента массива был меньше следующего.

                if (arrayForSort[i] < arrayForSort[i + 1]) {
                    temp = arrayForSort[i];
                    arrayForSort[i] = arrayForSort[i + 1];
                    arrayForSort[i + 1] = temp;
                    notSorted = true;
            }


            }

        }

        System.out.println("----------------------");
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(arrayForSort));

    }
}