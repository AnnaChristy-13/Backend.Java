package lesson30.person;

import lesson30.book.Book;
import lesson30.book.Bookcomparator1;
import lesson30.book.Bookcomparator2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonData {
    public static void main(String[] args) {

        Comparator<Person> personComparator = new PersonComparator1().thenComparing(new PersonComparator2());

        Set<Person> personSet = new TreeSet<>(personComparator);

        personSet.add(new Person("Adrian","Williams"));
        personSet.add(new Person("Maria","Johnson"));
        personSet.add(new Person("Erick","White"));


        System.out.println(personSet);



    }
}

