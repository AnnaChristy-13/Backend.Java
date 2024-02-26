package lesson30.book;

//1) Создать коллекцию книг в которую вы можете добавить новую книгу
//с параметрами (id, nameBook)
//Коллекция должна содержать уникальные элементы и они должны быть отсортированы
//по id и по имени

import java.util.Objects;

public class Book {

    private Integer idBook;

    private String nameBook;

    public Book(Integer idBook, String nameBook) {
        this.idBook = idBook;
        this.nameBook = nameBook;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(idBook, book.idBook) && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBook, nameBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                '}';
    }
}
