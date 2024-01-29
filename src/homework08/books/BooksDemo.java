package homework08.books;

public class BooksDemo {
sa    public static void main(String[] args) {
    BooksManager manager = new BooksManager();
    Book book1 = manager.createBookWithTwoParameters();
    Book book2 = manager.createBookWithAllParameters();

        System.out.println(book1);
        System.out.println(book2);
    }
}
