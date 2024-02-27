package lesson31;

//1) дан список целых чисел
//   написать метод, который удаляет из него все числа, которые больше заданного X
//   в качестве результата выведите измененный список

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {


        Set<Integer> numbers = new HashSet<>();
        numbers.add(56);
        numbers.add(43);
        numbers.add(20);
        numbers.add(87);
        numbers.add(69);
        numbers.add(33);

        System.out.println(numbers);

        int numbersLimit = 50;

        Iterator<Integer> numbersIterator = numbers.iterator();

        while (numbersIterator.hasNext()) {
           int tempNumber = numbersIterator.next();
            if (tempNumber>numbersLimit){
                numbersIterator.remove();
            }
            }
        System.out.println(numbers);




    }


}
