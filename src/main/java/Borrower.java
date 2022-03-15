import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<>();
    }

    public int countBorrowedBooks(){
        return this.borrowedBooks.size();
    }

    public void addBookToBorrowedBooks(Book book){
        this.borrowedBooks.add(book);
    }

    public void borrowBook(Library library, Book book){
        Book bookToBorrow = library.lendBook(book);
        this.addBookToBorrowedBooks(bookToBorrow);
    }
}
