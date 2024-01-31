package homework08.books;

public class BooksDemo {
   public static void main(String[] args) {
    BooksManager manager = new BooksManager();

    System.out.println("Creat first book");
    System.out.println("================");
    Book book1 = manager.createBookWithAllParameters();
    System.out.println("================");
    System.out.println("Creat second book");
    Book book2 = manager.createBookWithTwoParameters();
    System.out.println("Add please extra parameters: ");
    Book book3 = manager.addExtraParameters();


        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);



    }
}
