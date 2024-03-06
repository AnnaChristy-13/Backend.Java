package homework33.contactManager;
//Описание: Вам необходимо реализовать систему управления списком контактов.
//Каждый контакт представлен в виде объекта Contact с полями name (имя) и phoneNumber (номер телефона).
//Вам нужно использовать коллекцию для хранения контактов, чтобы гарантировать
//уникальность каждого контакта на основе его имени и номера телефона.
//
//Требования:
//
//Реализовать класс Contact с полями name (тип данных String) и phoneNumber (тип данных String).


import java.util.Objects;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }
}
