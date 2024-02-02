package homework11;

//public class homework13.Task2.Task1 { Подсчитать сумму всех четных чисел от 0 до N
//    при том что N вводится пользователем

import lessons06.scanner.UserInput;

public class Task1 {

    public static void main(String[] args) {
        UserInput ui = new UserInput();
        int N = ui.inputInteger("Enter any number ");
        for (int i=0; i< N; i=i+2){
            System.out.println("Evens numbers :" + i);
    }
}

}
