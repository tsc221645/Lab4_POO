package bean;

public class PaperThing {

    protected String title;
    protected String author;
    protected int pages;
    protected boolean status;

    /*
     * @method PaperThing
     * Constructor de la clase
     */
    public PaperThing(String title, String author, int pages, boolean status){
        setTitle(title);
        setAuthor(author);
        setPages(pages);
        setStatus(status);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    

    
}
