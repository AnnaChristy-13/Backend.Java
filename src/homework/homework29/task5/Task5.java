package homework29.task5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//- Создайте `HashSet` для хранения имен.
//- Добавьте в набор десять имен, некоторые из которых могут повторяться.
//- Выведите количество уникальных имен в наборе.
//- Проверьте, содержит ли набор определенное имя.
public class Task5 {

    public static void main(String[] args) {

        Set<String> nameSet = new HashSet<>();

        nameSet.add("Adriana");
        nameSet.add("Elisabeth");
        nameSet.add("Margareth");
        nameSet.add("Viktoria");
        nameSet.add("Helen");
        nameSet.add("Elisabeth");
        nameSet.add("Viktoria");
        nameSet.add("Anna");
        nameSet.add("Margareth");
        nameSet.add("Leticia");

        System.out.println("The list contains " + nameSet.size() + " unique names");

        String uniqueName = "Elisabeth";

            if (nameSet.contains(uniqueName)) {
                System.out.println(" ");
                System.out.println("The list of names contains " + uniqueName);
            } else {
                System.out.println("The list of names does not contain '" + uniqueName + "'.");


        }









    }
}
