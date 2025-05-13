
import java.util.*;

public class Library {

    protected String name;
    protected List<Book> books;
    protected List<Student> students;
    protected List<Librarian> librarians;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.librarians = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);

    }
}
