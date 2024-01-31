package homework09.task3;

import lessons06.scanner.UserInput;

public class Task3 {

    public static void main(String[] args) {

        // Программа просит пользователя ввести число от 1 до 7

        UserInput ui = new UserInput();
        int numberEnter = ui.inputInteger("Enter number from 1 to 7");

        // Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”

        switch (numberEnter) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Thuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
            case 5:
                System.out.println("Hurray! Today is Friday");
            case 6:
                System.out.println("Weekend!");
            case 7:
                System.out.println("Still weekend");
        }
    }
}



