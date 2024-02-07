package homework14;

//1. Создайте массив из всех нечётных чисел от 1 до 99.
//2. Выведите его на экран в строку в обратном порядке
public class task2 {
    public static void main(String[] args) {
//  1. Создали массив из всех нечётных чисел от 1 до 99.

        int myarray[] = new int[100];
        for (int i = 1; i < 100; i += 2) {
            myarray[i] = i;
            System.out.print(myarray[i] + " ");

//  2. Выведите его на экран в строку в обратном порядке
        }
        System.out.println();
        for (int i = 99; i > 0; i -= 2) {
            myarray[i] = i;
            System.out.print(myarray[i] + " ");
        }
    }
}

