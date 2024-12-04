import java.util.HashMap;
import java.util.Objects;

public class Book {
    private String title;
    private String ISBN;
    private String author;
    private String expirationDate;
    private HashMap<String, String> library;

    /*
     * Constructor for the book
     * @param String title the title of the book
     * @param String ISBN the ISBN of the book
     * @param String author the author of the book
     */
    public Book(String title, String ISBN, String author, String expirationDate){
        this.title = Objects.requireNonNull(title, "Title cannot be null.");
        this.ISBN = Objects.requireNonNull(ISBN, "ISBN cannot be null.");
        this.author = Objects.requireNonNull(author, "Author cannot be null.");
        this.expirationDate = Objects.requireNonNull(expirationDate, "Expiration date cannot be null");
        this.library = new HashMap<>();
    }

    /*
     * Getter method for title
     * @return title
     */
    public String getTitle(){
        return this.title;
    }

    /*
     * Getter method for ISBN
     * @return ISBN
     */
    public String getISBN(){
        return this.ISBN;
    }

    /*
     * Getter method for author
     * @return author
     */
    public String getAuthor(){
        return this.author;
    }

    /*
     * Add book into the library
     * @param Book book the book being added
     */
    public void addBook(Book book){
        library.putIfAbsent(book.getISBN(), book.getName());
    }

    /*
     * Remove book from the library
     * @param Book book the book being added
     */
    public void removeBook(Book book){
        library.remove(book.getISBN());
    }

    /*
     * Remove book that are outdated from the library
     * @param Book book the book being added
     */
    public void removeOutdated(){
        
    }
}
