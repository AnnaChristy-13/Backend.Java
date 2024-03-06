package lesson33;

public class ContactDemo {

    public static void main(String[] args) {

        ContactManager manager = new ContactManager();

        Contact contact1 = new Contact("Lilly","+1764563894857");
        Contact contact2 = new Contact("Amelie","+1765983309845");
        Contact contact3 = new Contact("Holger","+17658473635466");
        Contact contact4 = new Contact("Inga","+17649588596980");
        Contact contact5 = new Contact("Amelie","+1765983098476");


        manager.addContact(contact1);
        manager.addContact(contact2);
        manager.addContact(contact3);
        manager.addContact(contact4);
        manager.addContact(contact5);

        manager.removeContact(contact3);

        manager.getContacts();

        manager.getContactByName("Inga");

        manager.getContactByNumber("+1765983309845");
    }


}
