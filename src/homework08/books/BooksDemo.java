package homework08.books;

public class BooksDemo {
    public static void main(String[] args) {
    BooksManager manager = new BooksManager();
    Book book1 = manager.createBook();
    Book book2 = manager.createBook1();

        System.out.println(book1);
        System.out.println(book2);
    }
}
