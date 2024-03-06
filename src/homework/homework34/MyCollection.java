package homework34;

//Задание: Разработка пользовательского класса коллекции в Java
//
//        **Цель задания:** Создать класс в Java, который функционирует как упрощенная коллекция,
//        аналогичная `ArrayList` или `LinkedList`.
//        Этот класс должен поддерживать базовые операции добавления и удаления элементов.
//
//        #### Основные требования:
//
//        1. **Создание класса:** Разработайте класс, назовите его, например, `MyCollection`.
//        Этот класс должен использовать массив или другую структуру данных для хранения элементов.
//
//        2. **Вставка элементов:**
//        - Реализуйте метод `add(E element)`, который добавляет элемент в конец коллекции.
//        - Реализуйте метод `add(int index, E element)`, который вставляет элемент по
//        - указанному индексу, сдвигая существующие элементы вправо.
//
//        3. **Удаление элементов:**
//        - Реализуйте метод `remove(int index)`, который удаляет элемент по указанному индексу,
//        - сдвигая последующие элементы влево.
//
//        4. **Дополнительно:**
//        - Реализуйте метод `size()`, возвращающий текущий размер коллекции.
//        - Обеспечьте корректную обработку нестандартных ситуаций, например,
//        при попытке добавления элемента по недопустимому индексу или удаления
//        из пустой коллекции.
//
//        5. **Тестирование:**
//        - Создайте класс с методом `main` для демонстрации работы вашей коллекции.
//        Продемонстрируйте добавление, вставку и удаление элементов, а также вывод
//        размера коллекции.
//
//        #### Критерии оценки:
//
//        - **Функциональность:** Класс корректно реализует все запрошенные методы.
//        - **Корректность:** Программа обрабатывает краевые случаи, такие как вставка или удаление по недопустимым индексам.
//        - **Код:** Код должен быть чистым, хорошо структурированным и комментированным, чтобы облегчить понимание логики работы.
//
//        #### Рекомендации:
//
//        - Используйте массивы или связанные узлы в зависимости от выбранного вами аналога (`ArrayList` или `LinkedList`).
//        - Ваша коллекция должна работать с одним типом данных.
//        - Проверьте эффективность вашей реализации, особенно методы вставки и удаления, которые могут требовать перемещения элементов.


import java.util.ArrayList;
import java.util.LinkedList;

public class MyCollection {

    ArrayList<Element> myCollection = new ArrayList<>();

    public void add(Element element){
        myCollection.add(element);

    }

    public void add2(int index, Element element){
       if (index < 0 || index > myCollection.size()) {
       System.out.println("Not correct index to add element");
        }
        myCollection.add(index, element);


       }

    public void remove(int index) {
        if (index >= 0 && index < myCollection.size()) {
           myCollection.remove(index);
            System.out.println("My collection after removing element by index: ");
            System.out.println(myCollection);
        } else {
            System.out.println("Index is not correct");
        }
    }

    public int size(){
        System.out.println("The size of my collection: ");
        System.out.println(myCollection.size());
        return myCollection.size();
    }

    @Override
    public String toString() {
        return "MyCollection{" +
                "myCollection=" + myCollection +
                '}';
    }
}
