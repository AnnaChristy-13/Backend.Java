package lesson26;

import java.util.ArrayList;

public class PhoneCollectionDemo{

    public static void main(String[] args) {
        /*
        создать коллекцию телефонов
        показать что она создана и пустая
        добавить в нее один элемент
        показать что элемент добавлен
        добавить до 5 элементов
        показать коллекцию
        удалить один из элементов по индексу
        удалить один из элементов по объекту

         показать коллекцию

         */
        ArrayList<Phone> phones = new ArrayList<>();

        System.out.println("Создана пустая коллекция телефонов");

        System.out.println(phones);

        System.out.println("Добавлен один телефон в коллекцию");

        Phone phone1 = new Phone(1435,"S7Extra", "Xiomi",550.50);

        phones.add(phone1);

        System.out.println(phones);

        System.out.println("Добавлены четыре телефона в коллекцию");

        Phone phone2 = new Phone(1487,"K48756", "Huawei",550.50);
        Phone phone3 = new Phone(1547,"SHG67", "Sumsung",469.50);
        Phone phone4 = new Phone(4875,"13 ProMax", "Iphone",879.50);
        Phone phone5 = new Phone(9876,"12 Pro", "OnePlus",999.90);

        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);
        phones.add(phone5);

        System.out.println(phones);

        System.out.println("Коллекция телефонов после удаления телефона с индексои 2");

        phones.remove(2);

        System.out.println(phones);

        System.out.println("Коллекция телефонов после удаления телефона с названием OnePlus");

        phones.remove(phone5);

        System.out.println(phones);








    }
}
