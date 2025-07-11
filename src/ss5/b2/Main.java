package ss5.b2;

public class Main {
    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement("Yamaha MT01",300000000, 3);
        ProductManagement productManagement1 = new ProductManagement("Honda CBR 1000",700000000, 2);
        ProductManagement productManagement2 = new ProductManagement("Honda CBR 1000RR", 999000000, 2);

        productManagement.display();
        productManagement1.display();
        productManagement2.display();
    }
}

