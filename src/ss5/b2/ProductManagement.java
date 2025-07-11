package ss5.b2;

public class ProductManagement {
    private String Name;
    private double Price;
    private int Quantity;

    public ProductManagement(String Name, double Price, int Quantity) {
        this.Name = Name;
        this.Price = Price;
        this.Quantity = Quantity;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double caculateTotal() {
        return Price * Quantity;
    }

    public void display() {
        String info = """
                Name: %s
                Price: %.2f
                Quantity: %d
                """.formatted(Name, Price, Quantity);
        System.out.println(info);
    }
}
