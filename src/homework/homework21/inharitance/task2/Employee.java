package homework21.inharitance.task2;
//Создайте класс `Employee`, содержащий общую информацию о сотрудниках компании.
//От него наследуйте классы `Manager` и `Developer`. В классе `Manager` добавьте список
//подчиненных - массив сотрудников (экземпляры класса Employee),
//а в классе `Developer` - список проектов, над которыми работает разработчик - массив String[].
public class Employee {

    String surname;
    String name;
    int id;

    public Employee(String surname, String name, int id) {
        this.surname = surname;
        this.name = name;
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
