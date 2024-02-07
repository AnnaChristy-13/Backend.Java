package homework11;

//Используйте цикл, чтобы просуммировать все числа, которые ввел пользователь, до первого отрицательного.

import lessons06.scanner.UserInput;

public class Task3 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        int summa = 0;
        while (true) {
            int number = userInput.inputInteger("Enter please any positive (+) or negative (-) - number ");
            if (number >= 0) {
                summa = summa + number;
            } else {
                break;


            }

        }
        System.out.println("The summa of positive (+) entered numbers " + summa);
    }
}






