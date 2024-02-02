package homework13;

//Задание №2.
//
//        1.	Создайте массив из 5 случайных целых чисел из интервала [10;99]
//        2.	Выведите его на консоль в строку.
//        3.	Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.

public class Task2 {

    public static void main(String[] args) {

        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (99 - 10) + 10);
            System.out.println(array[i]);
        }
            for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i + 1]) {
                System.out.println("Массив со строго возравствющей последовательностью ");
                break;
            } else {
                    System.out.println("Массив с не строго возравствющей последовательностью ");
                break;


                }
            }
        }

    }

