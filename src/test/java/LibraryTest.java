import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

        private Library library;
        private Book book;
        private Book book2;
        private Book book3;

        @Before
        public void before(){
                library = new Library(2);
                book = new Book("Harry Potter", "JK Rowling", "Fantasy");
                book2 = new Book("IT", "Stephen King", "Horror");
                book3 = new Book("Call of the Wild", "Jack London", "Adventure");
        }

        @Test
        public void libraryIsEmpty(){
                assertEquals(0, library.bookCount());
        }

        @Test
        public void canAddBook(){
                library.addBook(book);
                assertEquals(1, library.bookCount());
        }

        @Test
        public void libraryAtCapacity(){
                library.addBook(book);
                library.addBook(book2);
                library.addBook(book3);
                assertEquals(2, library.bookCount());
        }

        @Test
        public void canLendBook() {
                library.addBook(book);
                library.addBook(book2);
                library.lendBook(book2);
                assertEquals(1, library.bookCount());
        }


}
