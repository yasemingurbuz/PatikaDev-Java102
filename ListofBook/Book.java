package ListofBook;

import java.time.LocalDate;
import java.util.Date;

public class Book {
    private String bookName;
    private String author;
    private int bookPage;
    private LocalDate releaseDate;

    public Book(String bookName, String author, int bookPage, LocalDate releaseDate) {
        this.bookName = bookName;
        this.author = author;
        this.bookPage = bookPage;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
