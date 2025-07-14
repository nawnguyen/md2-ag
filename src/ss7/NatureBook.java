package ss7;

public class NatureBook extends Book implements IBook {
    private int quantityPublicsher;

    public NatureBook(String nameBook, String publisher, int year, int quantityPublicsher) {
        super(nameBook, publisher, year);
        this.quantityPublicsher = quantityPublicsher;
    }

    @Override
    public void display() {
        System.out.println(
                "Tên sách: " + getNameBook() + ", " +
                        "Nhà xuất bản: " + getPublisher() + ", " +
                        "Năm xuất bản: " + getYear() + ", " +
                        "Số lượng xuất bản: " + quantityPublicsher
        );
    }
}
