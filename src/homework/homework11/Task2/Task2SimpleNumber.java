package homework11.Task2;

import lessons06.scanner.UserInput;

public class Task2SimpleNumber {
    //    проверить является ли число которое ввел пользователь - простым
//    (делится без остатка только на 1 и на себя)
//}
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        int inputInteger  = ui.inputInteger("Enter any integer number : ");
        Task2CheckNumber checknumber = new Task2CheckNumber();
        boolean isSimple = checknumber.isSimple(inputInteger);

        if (isSimple) {
            System.out.println("The number " + inputInteger + " is simple");
        }else{
                System.out.println("The number " + inputInteger + " is not simple");

        }
    }
}