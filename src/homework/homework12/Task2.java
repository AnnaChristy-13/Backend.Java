package homework12;

//Напишите программу, которая запрашивает у пользователя несколько чисел
//при вводе 0 - печатает сумму всех введенных чисел и их среднее арифметическое значение

import lessons06.scanner.UserInput;

public class Task2 {

    public static void main(String[] args) {

//        Запросили у пользователя ввести несколько чисел

        UserInput userInput = new UserInput();


//        Присваем переменным сумма и счетчик введенных пользователем чисел нулевое значение
        int summa = 0;
        int counter = 0;

//        Осуществили цикл,где при введении пользователем чисел не равных нулю суммируются числа, а при введении 0 цикл останавливается
//          и при помощи оператора if посчитали сумму введенных чисел и среднее арифметическое значение.

        while (true) {
            int number = userInput.inputInteger(" Enter please numbers (to end please enter 0)");
            if (number == 0) {
                break;
            }

            summa = summa + number;
            counter++;
        }

        if (counter > 0) {
            double average = (double) summa / counter;
            System.out.println("Summa of numbers is : " + summa);
            System.out.println("Average arithmetic mean is : " + average);
        } else {
            System.out.println("You did not enter any number ");
        }


    }
}
