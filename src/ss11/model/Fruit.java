package ss11.model;

public class Fruit {
    private String id;
    private String name;
    private String type;
    private String origin;
    private int price;

    public Fruit(String id, String name, String type, String origin, int price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.origin = origin;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getOrigin() {
        return origin;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Tên: " + name +
                " | Loại: " + type +
                " | Xuất xứ: " + origin +
                " | Giá: " + price;
    }
}
