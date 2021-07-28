package BookSorter;

import java.time.LocalDate;

public class Book implements Comparable<Book>{

    String name;
    String authorName;
    Integer pageNumber;
    LocalDate releaseDate;

    public Book(String name, String authorName, Integer pageNumber, LocalDate releaseDate) {
        super();
        this.name = name;
        this.authorName = authorName;
        this.pageNumber = pageNumber;
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book book) {
        return book.pageNumber.compareTo(this.pageNumber);
    }
}
