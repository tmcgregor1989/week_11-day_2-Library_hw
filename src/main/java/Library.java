import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private Integer capacity;

    public Library(Integer capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if(this.bookCount() < this.capacity){
        this.books.add(book);
    }}

    public Book lendBook(Book book){
        int bookToLend = this.books.indexOf(book);
        return this.books.remove(bookToLend);
    }
}
