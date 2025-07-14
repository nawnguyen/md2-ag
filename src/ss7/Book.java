package ss7;

public abstract class Book {
    private String nameBook;
    private String publisher;
    private int year;

    public Book(String nameBook, String publisher, int year) {
        this.nameBook = nameBook;
        this.publisher = publisher;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getYear() {
        return year;
    }
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
