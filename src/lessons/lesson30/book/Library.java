package lesson30.book;

import lesson30.book.Book;
import lesson30.book.Bookcomparator1;
import lesson30.book.Bookcomparator2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Library {
    public static void main(String[] args) {

        Comparator<Book> bookComparator = new Bookcomparator1().thenComparing(new Bookcomparator2());

        Set<Book> bookSet = new TreeSet<>(bookComparator);

        bookSet.add(new Book(3465, "War and Peace"));
        bookSet.add(new Book(8765, "Master and Margarita"));
        bookSet.add(new Book(75643, "12 Chairs"));

        System.out.println(bookSet);



    }

}
