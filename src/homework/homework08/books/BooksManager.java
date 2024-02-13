package homework08.books;


import lessons06.scanner.UserInput;


public class BooksManager {

    UserInput ui = new UserInput();


    public homework08.books.Book createBookWithAllParameters() {
        String authorBook1 = ui.inputText("Enter author of the book: ");
        String nameBook1 = ui.inputText("Enter name of the book: ");
        int totalPages1 = ui.inputInteger("Enter number of pages: ");
        int numberInCatalog1 = ui.inputInteger("Enter number of the book in Catalog: ");
        boolean isAvailable1 = ui.inputBoolean("Enter of availability of the book in library (1 - available, 0 - not available)");
        return new homework08.books.Book(authorBook1, nameBook1, totalPages1, numberInCatalog1, isAvailable1);
    }

    public Book createBookWithTwoParameters() {
        String authorBook = ui.inputText("Enter author of the book: ");
        String nameBook = ui.inputText("Enter name of the book: ");
        return new Book(authorBook, nameBook);

    }

    public Book addExtraParameters() {
        int totalPages3 = ui.inputInteger("Enter number of pages: ");
        int numberInCatalog3 = ui.inputInteger("Enter number of the book in Catalog: ");
        boolean isAvailable3 = ui.inputBoolean("Enter of availability of the book in library (1 - available, 0 - not available");
        return new Book(totalPages3, numberInCatalog3, isAvailable3);

    }
}





