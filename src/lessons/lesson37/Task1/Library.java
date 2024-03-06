package lesson37.Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1. **Задача на работу с коллекциями и generics:**
//        - **Задание:** Создайте класс `Library`, который хранит книги разных жанров.
//Используйте Generics для создания типобезопасной библиотеки,
//где можно хранить книги различных жанров в соответствующих коллекциях.
//- **Детали реализации:** Класс `Book` имеет поля `String title` и `String genre`.
//Класс `Library` должен содержать метод `addBook(Book book)`,
//который добавляет книгу в соответствующую коллекцию по жанру.
//Также необходим метод `List<Book> getBooksByGenre(String genre)`,
//который возвращает список книг заданного жанра.
public class Library <T>{



    Map<T,List<Book<T>>>booksByGenre = new HashMap<>();

   public void addBook(Book <T> book) {
       T genre = book.getGenre();
       List<Book<T>> books = booksByGenre.get(genre);
       if (books == null) {
           books = new ArrayList<>();
           booksByGenre.put(genre, books);

       }
       books.add(book);
   }

   public void getBooksByGenre (T genre){

       List<Book<T>> currentGanre = booksByGenre.get(genre);

       System.out.println("Genre " + genre + " Name of book: "  );

   }



    @Override
    public String toString() {
        return "Library{" +
                "booksByGenre=" + booksByGenre +
                '}';
    }
}
