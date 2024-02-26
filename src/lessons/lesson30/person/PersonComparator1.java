package lesson30.person;

import java.util.Comparator;

public class PersonComparator1 implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {

        return person1.getName().compareTo(person2.getName());
    }
}


