import java.util.Objects;

public class Patron {
    private String id;
    private String name;
    private String email;
    private String phone;
    private PatronType patronType;
    private List<String> borrowedBooks;

    /*
     * Constructor for the patron
     * @param String id the id of the patron
     * @param String name the name of the patron
     * @param String email the email of the patron
     * @param String phone the phone number of the patron
     * @param PatronType the patronType of the patron
     */
    public Patron(String id, String name, String email, String phone, PatronType patronType){
        this.id = Objects.requireNonNull(id, "Id cannot be null.");
        this.name = Objects.requireNonNull(name, "Name cannot be null.");
        this.email = Objects.requireNonNull(email, "Email cannot be null");
        this.phone = Objects.requireNonNull(phone, "Phone number cannot be null.");
        this.patronType = Objects.requireNonNull(patronType, "Patron type cannot be null.");
        borrowedBooks = new ArrayList<>();
    }

    /*
     * Getter method for id
     * @return id
     */
    public String getId(){
        return this.id;
    }

    /*
     * Getter method for name
     * @return name
     */
    public String getName(){
        return this.name;
    }

    /*
     * Getter method for email
     * @return email
     */
    public String getEmail(){
        return this.email;
    }

    /*
     * Getter method for phone number
     * @return phone number
     */
    public String getPhone(){
        return this.email;
    }

    /*
     * Getter method for patron type
     * @return patron type
     */
    public String getPatronType(){
        return this.patronType;
    }

    /*
     * Decides how many books different patron type can borrow
     * Student -> 3, Faculty -> 5, Guest -> 2
     * @param patronType the type of the patron
     * @return allowedNumber the number of books they can borrow
     */
    public int allowedNumber(PatronType patronType){
        int allowedNumber;
        switch(patronType){
            case STUDENT:
                allowedNumber = 3;
                break;
            case FACULTY:
                allowedNumber = 5;
                break;
            case GUEST:
                allowedNumber = 2;
        }
        return allowedNumber;
    }

    /*
     * Decides whether the patron can borrow the book
     * @return true if the patron's borrowed books have not exceeded the allowed number
     */
    public boolean canBorrow(){
        return borrowedBooks.size() < allowedNumber(this.getPatronType());
    }
}
