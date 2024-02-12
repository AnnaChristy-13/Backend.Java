package homework12;

import lessons06.scanner.UserInput;

public class Task1 {
//    Задание 1. У вас есть текст
//    Требуется:
//    убрать все специальные символы, такие "(", ")", "@"
//    (методом replaceAll не пользоваться)

    public static void main(String[] args) {

//        Запрашиваем ввести пользователя  тест со специальными символами

        UserInput userInput = new UserInput();
        String text = userInput.inputText("Enter any text");

//        Создаем переменную типа string и присваеваем ей символ (пустая строка) на который будут меняться наши специальные стволы в тексте

        String changedText = "";

//        Циклом проходим по введеному пользователем по длине текста и проверяем, является ли символ в тексте ( или ) или @.
//          Если это не специальные символы, то текущий символ добавляется в строке changedText.

        for (int i = 0; i < text.length() - 1; i++) {
            changedText += text.charAt(i) != '(' && text.charAt(i) != ')'&& text.charAt(i) != '@' ? text.charAt(i) : "";
        }
        System.out.println("Changed text without symbols " + changedText);

    }
}



