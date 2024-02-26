package lesson30.book;

import lesson30.book.Book;

import java.util.Comparator;

public class Bookcomparator1 implements Comparator<Book>{

           @Override
        public int compare(Book book1, Book book2) {
            int compareResult = book1.getIdBook() - book2.getIdBook();

            return compareResult;
        }
    }

