package homework19;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {


//    Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
//    Не используйте дополнительный массив для хранения результатов.

        String[] myTextForSort = {"You", "can", "never", "be", "overdressed", "or", "overeducated"};


        System.out.println(Arrays.toString(myTextForSort));

        int n = myTextForSort.length;

        for (int i = 0; i < n/2; i++) {
            String currentWord = myTextForSort[n-i-1];
            myTextForSort[n-i-1]=myTextForSort[i];
            myTextForSort[i]=currentWord;

        }
        System.out.println("==========================");
        System.out.println("My text in reverse order: ");
        System.out.println(Arrays.toString(myTextForSort));
    }
}