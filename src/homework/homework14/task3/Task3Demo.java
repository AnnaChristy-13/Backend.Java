package homework14.task3;

public class Task3Demo {

    int array[] = new int[15];

//1. Создаем метод для создания массива из случайных чисел.

    public int [] createArrays() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);

        }
        return array;
    }
//2. Создаем метод для вычисления четных чисел в массиве и их количество.
    public void evenNumbersCounter() {
        int arrayCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayCounter = arrayCounter + 1;

            }

        }
        System.out.println("Amount of even numbers: " + arrayCounter);



    }
}