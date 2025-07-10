package ss5.b1;

public class Main {
    public static void main(String[] args) {
        Banker banker1 = new Banker("Naw Nguyen", "03453484746", "Dev");
        Banker banker2 = new Banker("Tinh Ho", "03457478364", "PayLak");

        banker1.showInfo();
        banker2.showInfo();
        System.out.println("Tên công ty: "+ Banker.companyName);
    }
}
