package homework29.task2;

//Операции с числовым списком:**
// - Создайте `LinkedList` для хранения целых чисел.
// - Добавьте в список случайные числа в диапазоне от 1 до 100.
// - Найдите и выведите максимальное и минимальное числа в списке.
// - Отсортируйте список в порядке возрастания и выведите его.

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListInteger {

    public static void main(String[] args) {

        LinkedList<Integer> randomList = new LinkedList<>();



        for (int i = 0; i < 10; i++) {
        double random = Math.random()*(100-1)+1;
        randomList.add((int)random);
        }
        System.out.println(" ");
        System.out.println(randomList);
        int maxRandomNumber = Collections.max(randomList);
        int minRandomNumber = Collections.min(randomList);

        System.out.println(" ");
        System.out.println("Max number of random numbers: " + maxRandomNumber );
        System.out.println(" ");
        System.out.println("Min number of random numbers: " + minRandomNumber);

        Collections.sort(randomList);

        System.out.println(" ");
        System.out.println("Sorted list with random numbers: ");
        System.out.println(randomList);






    }
}
