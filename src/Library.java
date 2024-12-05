import java.util.HashMap;

public class Library {

    private HashMap<String, String> library = new HashMap<>();
    
    /*
     * Add book into the library
     * @param Book book the book being added
     */
    public void addBook(Book book){
        library.putIfAbsent(book.getISBN(), book.getTitle());
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
