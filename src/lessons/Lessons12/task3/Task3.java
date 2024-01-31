package Lessons12.task3;

import lessons06.scanner.UserInput;

public class Task3 {
//    Задание 1. У вас есть текст
//    Требуется:
//    убрать все специальные символы, такие "(", ")", "@"
//            (методом replaceAll не пользоваться)

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        String text = userInput.inputText("Enter any text");

        char symbol1 = "(";
        char symbol2 = ")";
        char symbol3 = "@";
        int myTextLenght = text.length();

        for (int i = 0; i < myTextLenght; i++) {
            char currentChar = text.charAt(i);
            if (currentChar == symbol1 || symbol2 || symbol3) {
                currentChar afterCheck = " ";
            }


        }
    }
}




