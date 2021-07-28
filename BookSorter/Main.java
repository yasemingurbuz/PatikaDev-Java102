package BookSorter;

import java.time.LocalDate;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> booksPageNumber =  new TreeSet<Book>();
        booksPageNumber.add(new Book("Under Heaven", "Guy Gavriel Kay",664, LocalDate.parse("2010-04-27")));
        booksPageNumber.add(new Book("The Goblin Emperor", "Katherine Addison",416, LocalDate.parse("2017-03-24")));
        booksPageNumber.add(new Book("Lockwood & Co", "Jonathan Stroud",400, LocalDate.parse("2013-08-23")));
        booksPageNumber.add(new Book("Wheel of Time", "Robert Jordan",1064, LocalDate.parse("2013-01-08")));
        booksPageNumber.add(new Book("Archer's Voice", "Mia Sheridan",345, LocalDate.parse("2014-01-25")));
        for(Book book : booksPageNumber) {
            System.out.println(book.pageNumber);
        }

    }
}
