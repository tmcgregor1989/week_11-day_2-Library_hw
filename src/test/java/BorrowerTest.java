import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(2);
        book1 = new Book("Harry Potter", "JK Rowling", "Fantasy");
        book2 = new Book("IT", "Stephen King", "Horror");
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(library, book1);
        assertEquals(1, borrower.countBorrowedBooks());
    }
}
