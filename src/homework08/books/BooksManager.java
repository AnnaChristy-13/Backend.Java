package homework08.books;

import lessons.lessons06.UserInput;

public class BooksManager {

    UserInput ui = new UserInput();

    public Book createBook ();

    String authorBook = ui.inputText("Enter author of the book: ");
    String nameBook = ui.inputText("Enter name of the book: ");


    public Book createBook1 ();
    String authorBook1 = ui.inputText("Enter author of the book: ");
    String nameBook1 = ui.inputText("Enter name of the book: ");
    int totalPages1 = ui.inputInteger("Enter number of pages: ");
    int numberInCatalog1 = ui.inputInteger("Enter number of the book in Catalog: ");
    boolean isAvailable1 = ui.inputText("Enter of availability of the book in library");

}
