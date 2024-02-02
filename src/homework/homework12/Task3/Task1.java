package homework12.Task3;

import lessons06.scanner.UserInput;

public class Task1 {
//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов,
//а температура второй колбы меньше 100 градусов.
//
//a. Вы должны написать метод, который проверяет это устройство.
//b. Ваша программа должна иметь переменные temperature1 и temperature2.
//c. В результате метод возвращает true или false.

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        int temperature1 = userInput.inputInteger("Enter please the temperature of the first bottle in the device ");
        int temperature2 = userInput.inputInteger("Enter please the temperature of the second bottle in the device ");

        if ((temperature1 > 100) && (temperature2 < 100)) {
            System.out.println("The device works correct ");
        } else {
            System.out.println("The device works not correct");

        }
    }
}


