package ss7;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new NatureBook("Một đời như kẻ tìm đường", "Nhà xuất bản trẻ", 1999, 1000);
        books[1] = new SocialBook("Tôi làm được bạn cũng thế", "Nhà xuất trẻ", 1990, "Adam Khoo");
        books[2] = new NatureBook("Cà phê sáng cùng tony", "Nhà xuất bản trẻ", 2000, 500);
        books[3] = new NatureBook("Mindset", "Nhà xuất bản trẻ", 2002, 2000);
        books[4] = new SocialBook("Cách sống: Từ bình thường đến phi thường", "Nhà xuất bản trẻ", 1995, "Inamori Kazuo");

        for (Book book : books) {
            ((IBook) book).display();
        }
    }
}
