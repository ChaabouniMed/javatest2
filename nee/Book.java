package nee;
public class Book {
    private String ISBN;
    private String title;
    private String author;
    private String genre;
    private boolean availability;
    public Book(String iSBN, String title, String author, String genre, boolean availability) {
        ISBN = iSBN;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = availability;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
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
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
}
