package homework33.contactManager;

import java.util.HashSet;
import java.util.Set;


//Реализовать класс ContactManager, который будет управлять списком контактов.
//Класс ContactManager должен содержать следующие методы:
//addContact(Contact contact): добавляет контакт в список. Если контакт с таким именем и
//номером телефона уже существует, необходимо выдать сообщение об ошибке.
//removeContact(Contact contact): удаляет контакт из списка.
//getContacts(): возвращает список всех контактов.
//getContactByName(String name): возвращает контакт по имени.
//getContactByPhoneNumber(String phoneNumber): возвращает контакт по номеру телефона.

public class ContactManager {

    Set<Contact> contactSet = new HashSet<>();

    public void addContact(Contact anotherContact) {
        for (Contact contact : contactSet) {
            contactSet.add(contact);
            if (contact.getName().equals(anotherContact.getName()) || contact.getPhoneNumber().equals(anotherContact.getPhoneNumber())) {
                System.out.println("Contact's name and number already exists " + contact.getName() +" "+ contact.getPhoneNumber());
                return;
            }
        }
        contactSet.add(anotherContact);
    }

    public void removeContact(Contact anotherContact) {
        System.out.println("Removed contact: " + anotherContact);
        contactSet.remove(anotherContact);

    }

    public void getContacts() {
        System.out.println("List of contacts: ");
        for (Contact contact : contactSet) {
            System.out.println(contact);

        }
    }

    public Contact getContactByName(String anotherName) {
        for (Contact contact : contactSet) {
            if (contact.getName().equals(anotherName)) {
                System.out.println("Contact's name and number: " + contact.getName() +" "+ contact.getPhoneNumber());
                return contact;
            }
        }
        return null;
    }

    public Contact getContactByNumber(String anotherPhoneNumber) {
        for (Contact contact : contactSet) {
            if (contact.getPhoneNumber().equals(anotherPhoneNumber)) {
                System.out.println("Contact's name and number: " + contact.getPhoneNumber()+ " " + contact.getName());
                return contact;
            }
        }
        return null;

    }
}


