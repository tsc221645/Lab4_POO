package bean;

import java.util.ArrayList;

public class User {
    protected int userID;
    protected String userName;
    protected String password;
    protected Book[] books;
    protected ArrayList<Magazine> magazines;

    /*
     * @method User
     * Constructor de la clase
     */
    public User(int userID, String userName, String password, Book[] books, ArrayList<Magazine> magazines){
        setUserID(userID);
        setUserName(userName);
        setPassword(password);
        setBooks(books);
        setMagazines(magazines);
    }

    /*
     * @method getUserID
     * @return userID
     */
    public int getUserID() {
        return userID;
    }

    /*
     * @method setUserID
     * @param userID
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /*
     * @method getUserName
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /*
     * @method setUserName
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /*
     * @method getPassword
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /*
     * @method setPassword
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public ArrayList<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(ArrayList<Magazine> magazines) {
        this.magazines = magazines;
    }

}
