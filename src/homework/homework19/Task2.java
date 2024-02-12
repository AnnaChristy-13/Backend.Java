package homework19;

//Напишите программу, которая определит, сколько слов Вы ввели с консоли.

import lessons06.scanner.UserInput;

public class Task2 {
    public static void main(String[] args) {

//        Запрашиваем текст с консоли

        UserInput userInput = new UserInput();
        String text = userInput.inputText("Enter please any text: ");

//        Присваеваем переменный int (для счетчика слов в тексте) единицу (хотя бы одно слово нужно ввести в тексте).

          int wordCounter = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)==' '){
                wordCounter++;
            }

        }
        System.out.println("In the text you entered are " + wordCounter + " words");
    }
}
