package homework29.task3;

import lessons06.scanner.UserInput;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

//Словарь перевода слов:**
// - Создайте `HashMap`, где ключом является слово на английском языке, а значением - его перевод на другой язык.
// - Добавьте в словарь пять пар слов.
// - Выведите перевод слова, введенного пользователем.
// - Удалите слово из словаря и выведите обновленный список слов.
public class Word {

    public static void main(String[] args) {

        Map<String, String> translator = new HashMap<>();

        translator.put("dog", "Hund");
        translator.put("cat", "Katze");
        translator.put("horse", "Pferd");
        translator.put("cow", "Kuh");
        translator.put("duck", "Ente");

        UserInput userInput = new UserInput();
        String word = userInput.inputText("Enter please a word ");

        if (translator.containsKey(word)) {
            System.out.println("Translation: " + translator.get(word));
        } else {
            System.out.println("This word you entered  was not been found ");
        }

//        translator.remove(4);

        String wordToDelete = userInput.inputText("Enter please a word you want to delete");

        if (translator.containsKey(wordToDelete)) {
            System.out.println("The word is deleted from translator: " + translator.remove(wordToDelete));
        } else {
            System.out.println("This word you entered  was not been found ");
        }


        System.out.println("Updated translator :");
        for (int i = 0; i < translator.size(); i++) {

        }
        System.out.println(translator.entrySet() );


    }
}


