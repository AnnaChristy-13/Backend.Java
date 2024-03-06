package homework32;

//Задача "Сортировка стека"
//
//        Описание: Дан стек целых чисел, который нужно отсортировать так,
//        чтобы наименьшие элементы оказались на вершине.
//        Вы можете использовать дополнительный временный стек,
//        но вы не должны копировать элементы в другие структуры данных (например, массивы).
//        Стек поддерживает следующие операции: push, pop, peek и isEmpty.
//
//        Цель: Написать функцию, которая отсортирует стек в порядке возрастания
//        элементов сверху вниз.

import java.util.Stack;

public class Task1 {
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();


            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }

            tempStack.push(current);
        }


        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(10);
        myStack.push(3);
        myStack.push(13);
        myStack.push(9);
        myStack.push(1);

        sortStack(myStack);

        System.out.println("Sorted stack:");
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop() + " ");
        }
    }
}

