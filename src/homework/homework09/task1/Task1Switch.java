package homework09.task1;

import lessons06.scanner.UserInput;

public class Task1Switch {
            public static void main(String[] args) {

                // пользователю предлагается ввести число на выбор : 1, 2 или 3

            UserInput ui = new UserInput();
            int numberEnter = ui.inputInteger("Enter number 1,2 or 3");

                // программа выводит, какое число ввёл пользователь: 1, 2, или 3

        switch (numberEnter) {
            case 1:
                System.out.println("You entered number 1.");
                break;
            case 2:
                System.out.println("You entered number 2.");
                break;
            case 3:
                System.out.println("You entered number 3.");
                break;
            default:
                System.out.println("You entered invalid number");
        }
    }
}
