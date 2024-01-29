package homework08.books;


import lessons06.scanner.UserInput;

public class BooksManager {

    UserInput ui = new UserInput();

    public Book createBookWithTwoParameters() {
        String authorBook = ui.inputText("Enter author of the book: ");
        String nameBook = ui.inputText("Enter name of the book: ");
        return new Book(authorBook, nameBook);
    }


    public Book createBookWithAllParameters() {
        String authorBook1 = ui.inputText("Enter author of the book: ");
        String nameBook1 = ui.inputText("Enter name of the book: ");
        int totalPages1 = ui.inputInteger("Enter number of pages: ");
        int numberInCatalog1 = ui.inputInteger("Enter number of the book in Catalog: ");
        boolean isAvailable1 = ui.inputInteger("Enter of availability of the book in library (1 - available, 0 - not available") == 1 ;
        return new Book(authorBook1, nameBook1, totalPages1, numberInCatalog1, isAvailable1);

    }
}
