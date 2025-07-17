package ss9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FruitManagement {
    private String nameFruit;
    private String typeFruit;
    private LocalDate manufacturingDate;
    private LocalDate expiryDate;
    private String originFruit;
    private int price;

    public FruitManagement(String nameFruit, String typeFruit, LocalDate manufacturingDate, LocalDate expiryDate, String originFruit, int price) {
        this.nameFruit = nameFruit;
        this.typeFruit = typeFruit;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.originFruit = originFruit;
        this.price = price;
    }

    public String getName() {
        return nameFruit;
    }

    public void setName(String name) {
        this.nameFruit = name;
    }

    public String getTypeFruit() {
        return typeFruit;
    }

    public void setTypeFruit(String typeFruit) {
        this.typeFruit = typeFruit;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getOriginFruit() {
        return originFruit;
    }

    public void setOriginFruit(String originFruit) {
        this.originFruit = originFruit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static ArrayList<FruitManagement> listFruit = new ArrayList<FruitManagement>();

    static {
        listFruit.add(new FruitManagement("Táo", "Nhiệt đới", LocalDate.now(), LocalDate.now().plusDays(10), "Made in China", 10000));
        listFruit.add(new FruitManagement("Mận", "Nhiệt đới", LocalDate.now(), LocalDate.now().plusDays(11), "Made in Viet Nam", 5000));
        listFruit.add(new FruitManagement("Mango", "Nhiệt đới", LocalDate.now(), LocalDate.now().plusDays(5), "Made in Viet Nam", 5000));
        listFruit.add(new FruitManagement("BlackBerry", "Nhiệt đới", LocalDate.now(), LocalDate.now().plusDays(7), "Made in Viet Nam", 20000));
    }

    public static void addFruit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        String nameFruit = sc.nextLine();
        System.out.println("Nhập kiểu trái cây: ");
        String typeFruit = sc.nextLine();
        LocalDate manufacturingDate = LocalDate.now();
        LocalDate expiryDate = LocalDate.now().plusDays(10);
        System.out.println("Nhập nơi xuất xứ: ");
        String originFruit = sc.nextLine();
        System.out.println("Nhập giá: ");
        int price = sc.nextInt();

        listFruit.add(new FruitManagement(nameFruit, typeFruit, manufacturingDate, expiryDate, originFruit, price));
    }

    public static void showFruit() {
        for (FruitManagement fruitManagement : listFruit) {
            System.out.println(
                    "Tên trái cây: " + fruitManagement.nameFruit +
                    ", Kiểu trái cây: " + fruitManagement.typeFruit +
                    ", Ngày sản xuất: " + fruitManagement.manufacturingDate +
                    ", Hạn sử dụng: " + fruitManagement.expiryDate +
                    ", Xuất xứ: " + fruitManagement.originFruit +
                    ", Giá: " + fruitManagement.price
            );
        }
    }

}
