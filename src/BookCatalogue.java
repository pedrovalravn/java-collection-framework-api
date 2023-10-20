import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}

public class BookCatalogue {
    private List<Book> bookList;

    public BookCatalogue() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int yearPublished) {
        Book newBook = new Book(title, author, yearPublished);
        bookList.add(newBook);
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(b);
            }
        }
        return booksByAuthor;
    }

    public List<Book> searchByYearInterval(int initialYear, int finalYear) {
        List<Book> booksByYearInterval = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getYearPublished() >= initialYear && b.getYearPublished() <= finalYear) {
                booksByYearInterval.add(b);
            }
        }
        return booksByYearInterval;
    }

    public Book searchByTitle(String title) {
        for (Book b : bookList) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        BookCatalogue booksCatalogue = new BookCatalogue();

        booksCatalogue.addBook("Book 1", "Author 1", 2000);
        booksCatalogue.addBook("Book 1", "Author 2", 2010);
        booksCatalogue.addBook("Book 3", "Author 7", 2020);
        booksCatalogue.addBook("Book 3", "Author 5", 2019);
        booksCatalogue.addBook("Book 4", "Author 2", 2003);

        System.out.println(booksCatalogue.searchByAuthor("Author 1"));
        System.out.println(booksCatalogue.searchByYearInterval(1999, 2021));
        System.out.println(booksCatalogue.searchByTitle("Book 3"));
    }
}
