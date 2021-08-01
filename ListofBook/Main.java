package ListofBook;

import java.security.Key;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Map<String, String>  bookNameAuthor = new HashMap<>();
        List<Book> bookPage = new ArrayList<>();

        books.add(new Book("Immortals After Dark", "Kresley Cole",368, LocalDate.parse("2008-04-29")));
        books.add(new Book("Under Heaven", "Guy Gavriel Kay",664, LocalDate.parse("2010-04-27")));
        books.add(new Book("Kalbim Sende Kalmış", "Selvi Atıcı",432, LocalDate.parse("2016-01-17")));
        books.add(new Book("Blessings", "Sharon Sala",383, LocalDate.parse("2015-05-01")));
        books.add(new Book("Lockwood & Co ", "Jonothan Stroud",80, LocalDate.parse("2013-08-29")));
        books.add(new Book("Ruhun Ateşi ", "Rita Hunter ",496, LocalDate.parse("2013-04-29")));
        books.add(new Book("Raven's Shadow ", "Anthony Ryan ", 664, LocalDate.parse("2014-05-16")));
        books.add(new Book("The Wheel of Time", "Rober Jordan , Brandon Sanderson",1064, LocalDate.parse("2013-01-08")));
        books.add(new Book("The Martian ", "Andy Weir ",84, LocalDate.parse("2014-02-11")));
        books.add(new Book("The Name of the Wind", "Patric Rothfuss ",736, LocalDate.parse("2007-03-27")));

        books.forEach(book ->{
           bookNameAuthor.put(book.getBookName(),book.getAuthor());
        });
        System.out.println("Name of Book , Author of Books : ");
        System.out.println(" ");

        for(String key : bookNameAuthor.keySet()) {
            System.out.println(key + " ,  " + bookNameAuthor.get(key));

        }
         System.out.println("---------------------------------------------");
        System.out.println("List of books with more than 100 pages : ");
        System.out.println(" ");

        books.stream().filter(book -> book.getBookPage() > 100).forEach(book -> bookPage.add(book));

        for(Book b : bookPage) {
            System.out.println(b.getBookName() + " -> " + b.getBookPage() );
        }

    }
}
