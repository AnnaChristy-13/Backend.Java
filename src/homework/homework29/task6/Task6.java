package homework29.task6;
//Удаление дубликатов из списка:**
// - Создайте `ArrayList` с дублирующимися элементами.
// - Преобразуйте `ArrayList` в `HashSet`, чтобы автоматически удалить дубликаты.
// - Выведите новый список без дубликатов.
// - Добавьте новые элементы в `HashSet` и снова преобразуйте его обратно в `ArrayList`.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class Task6 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Adriana");
        names.add("Elisabeth");
        names.add("Margareth");
        names.add("Viktoria");
        names.add("Helen");
        names.add("Elisabeth");
        names.add("Viktoria");
        names.add("Anna");
        names.add("Margareth");
        names.add("Leticia");
        System.out.println("List of names: ");
        System.out.println(Arrays.asList(names));

        HashSet<String> namesSet = new HashSet<>(names);
        System.out.println(" ");
        System.out.println("List of names without duplicates: ");
        System.out.println(namesSet);

        namesSet.add("Milena");
        namesSet.add("Violetta");

        ArrayList<String> updatedNames = new ArrayList<>(namesSet);
        System.out.println(" ");
        System.out.println("Updated list of names: ");
        System.out.println(updatedNames);






    }
}
