package lesson37.Task1;

public class LibraryDemo {
    public static void main(String[] args) {

        Library  library = new Library();



        library.addBook(new Book("12 chairs","Comedy"));
        library.addBook(new Book("3 beares","Comedy"));
        library.addBook(new Book("Holmes","Detective"));
        library.addBook(new Book("Death on the Nile","Detective"));
        library.addBook(new Book("Three musketeers","Adventures"));

        System.out.println(library);

        library.getBooksByGenre("Detective");



    }
}
