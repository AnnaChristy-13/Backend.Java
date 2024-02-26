package homework29.task1;
//**Управление списком студентов:**
//        - Создайте `ArrayList` для хранения имен студентов.
//        - Добавьте в список пять имен студентов.
//        - Выведите список студентов в обратном порядке.
//        - Удалите студента из списка по индексу и выведите обновленный список.

import java.util.List;

public class Student {

    private String surname;
    private String name;

    public Student(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
