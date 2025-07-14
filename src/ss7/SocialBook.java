package ss7;

public class SocialBook extends Book implements IBook {
    private String author;

    public SocialBook(String nameBook, String publisher, int year, String author) {
        super(nameBook, publisher, year);
        this.author = author;
    }

    @Override
    public void display() {
        System.out.println(
                "Tên sách: " + getNameBook() + ", " +
                        "Nhà xuất bản: " + getPublisher() + ", " +
                        "Năm xuất bản: " + getYear() + ", " +
                        "Tác giả: " + author
        );
    }
}
