package homework32;

//Задача "Ротация очереди"
//
//Описание: Дана очередь целых чисел и число k, представляющее количество
//операций ротации, которые необходимо выполнить с очередью.
//Ротация очереди означает перемещение последнего элемента очереди в её начало.
//Реализуйте функцию, которая модифицирует очередь, выполняя k ротаций.
//
//Цель: Написать функцию, которая принимает очередь и число k, затем
//выполняет k ротаций очереди.

import java.util.ArrayDeque;
import java.util.Queue;

public class Task2 {
    public static void rotateQueue(Queue<Integer> queue, int k) {
        if (queue == null || k <= 0) {
            return;
        }

        int size = queue.size();
        k %= size;

        for (int i = 0; i < k; i++) {
            Integer lastElement = queue.poll();
            queue.offer(lastElement);
        }
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(8);
        queue.offer(1);
        queue.offer(15);
        queue.offer(5);
        queue.offer(10);

        int k = 9;                ;
        rotateQueue(queue, k);

        System.out.println("Result after " + k + " rotations:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
