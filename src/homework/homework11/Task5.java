package homework11;

import lessons06.scanner.UserInput;

//    Пользователь ввел число N. Подсчитайте количество четных и не четных чисел в диапазоне от 0 до N
public class Task5 {
    public static void main(String[] args) {

//        Запросили число от пользователя

        UserInput userInput = new UserInput();
        int number = userInput.inputInteger(" Enter please any positive number ");

//          Назначили счетчики четных и нечетных чисел

        int evenNumberCounter = 0;
        int oddNumberCounter =0;

//            С помощью цикла вычислили количество четных и нечетных чисел в диапазоне от 0 до числа введенного пользователем

        for (int i = 0; i <=number ; i++) {
                  if (i % 2 == 0) {
                    evenNumberCounter++;
                } else {
                    oddNumberCounter++;
                }

            }
            System.out.println("Amount of even numbers are " + evenNumberCounter);
            System.out.println("Amount of odd numbers are " + oddNumberCounter);
    }

}
