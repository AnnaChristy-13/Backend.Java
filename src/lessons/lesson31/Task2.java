package lesson31;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Дан список String
//написать метод, который заменяет все элементы, которые содержат букву 'a'
//на "..."
public class Task2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Monday");
        words.add("Tuesday");
        words.add("Wednesday");
        words.add("Thursday");
        words.add("Friday");
        words.add("Saturday");
        words.add("Sunday");

        System.out.println("List of week days: ");
        System.out.println(words);

        ListIterator<String> wordsIterator = words.listIterator();

        while (wordsIterator.hasNext()) {
        String currentWord = wordsIterator.next();

            if (currentWord.contains("u")) {
                wordsIterator.set("...");
            }
        }
        System.out.println(" ");
        System.out.println("List of week days after changing letter u: ");
        System.out.println(words);
    }
}
