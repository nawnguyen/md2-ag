package ss12.view;

import ss12.controller.FruitController;
import ss12.model.Fruit;
import java.util.Map;
import java.util.Scanner;

public class FruitView {
    private FruitController controller = new FruitController();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("==========MENU==========");
            System.out.println("1. Hiển thị danh sách (keySet)");
            System.out.println("2. Hiển thị danh sách (entrySet)");
            System.out.println("3. Thêm trái cây");
            System.out.println("4. Xóa trái cây");
            System.out.println("5. Sửa trái cây");
            System.out.println("0. Thoát");
            System.out.println("========================");
            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showByKeySet();
                    break;
                case 2:
                    showByEntrySet();
                    break;
                case 3:
                    Fruit fruit = inputFruit();
                    controller.save(fruit);
                    break;
                case 4:
                    System.out.print("Nhập mã trái cây cần xóa: ");
                    String idDelete = scanner.nextLine();
                    controller.delete(idDelete);
                    break;
                case 5:
                    System.out.print("Nhập mã trái cây cần sửa: ");
                    String idUpdate = scanner.nextLine();
                    Fruit fruitUpdate = inputFruit();
                    fruitUpdate.setId(idUpdate);
                    controller.save(fruitUpdate);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private Fruit inputFruit() {
        System.out.print("Nhập mã: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập loại: ");
        String type = scanner.nextLine();
        System.out.print("Nhập xuất xứ: ");
        String origin = scanner.nextLine();
        System.out.print("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        return new Fruit(id, name, type, origin, price);
    }

    private void showByKeySet() {
        for (String key : controller.findAll().keySet()) {
            System.out.println(controller.findAll().get(key));
        }
    }

    private void showByEntrySet() {
        for (Map.Entry<String, Fruit> entry : controller.findAll().entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

