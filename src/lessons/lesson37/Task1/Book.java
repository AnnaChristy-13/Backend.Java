package lesson37.Task1;

//- **Детали реализации:** Класс `Book` имеет поля `String title` и `String genre`.
public class Book <T>{

    private String title;
    private T genre;

    public Book(String title, T genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public T getGenre() {
        return genre;
    }

    public void setGenre(T genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                '}';
    }
}
