package homework08.books;

public class Book {
    String authorBook;
    String nameBook;
    int totalPages;
    int numberInCatalog;
    boolean isAvailable;

    public Book(String authorBook, String nameBook) {
        this.authorBook = authorBook;
        this.nameBook = nameBook;
    }

    public Book(String authorOfBook, String nameOfBook, int numberOfPages, int numberInCatalog, boolean availOfBook) {
        this.authorBook = authorOfBook;
        this.nameBook = nameOfBook;
        this.totalPages = numberOfPages;
        this.numberInCatalog = numberInCatalog;
        this.isAvailable = availOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "  authorBook='" + authorBook + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", totalPages=" + totalPages +
                ", numberInCatalog=" + numberInCatalog +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
