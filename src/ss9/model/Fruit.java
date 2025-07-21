package ss9.model;

import java.time.LocalDate;

public class Fruit {
    private String nameFruit;
    private String typeFruit;
    private LocalDate manufacturingDate;
    private LocalDate expiryDate;
    private String originFruit;
    private int price;

    public Fruit(String nameFruit, String typeFruit, LocalDate manufacturingDate, LocalDate expiryDate, String originFruit, int price) {
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

    @Override
    public String toString() {
        return "Tên: " + nameFruit +
                " | Loại: " + typeFruit +
                " | NSX: " + manufacturingDate +
                " | HSD: " + expiryDate +
                " | Xuất xứ: " + originFruit +
                " | Giá: " + price;
    }
}
