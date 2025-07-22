package ss9.view;

import ss9.controller.FruitController;
import ss9.model.Fruit;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class FruitView {
    private final Scanner scanner = new Scanner(System.in);
    private final FruitController controller = new FruitController();

    public void displayMenu() {
        int choice;
        do {
            System.out.println("\n========= MENU QUẢN LÝ TRÁI CÂY =========");
            System.out.println("1. Hiển thị danh sách trái cây");
            System.out.println("2. Thêm trái cây mới");
            System.out.println("0. Thoát");
            System.out.println("==========================================");
            System.out.print("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> showFruits();
                case 2 -> addNewFruit();
                case 0 -> System.out.println("Đã thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }

    private void showFruits() {
        List<Fruit> fruits = controller.getAllFruit();
        if (fruits.isEmpty()) {
            System.out.println("Danh sách trống !");
        } else {
            for (Fruit fruit : fruits) {
                System.out.println(fruit);
            }
        }
    }

    private void addNewFruit() {
        System.out.print("Tên trái cây: ");
        String name = scanner.nextLine();

        System.out.print("Loại trái cây: ");
        String type = scanner.nextLine();

        System.out.print("Nguồn gốc: ");
        String origin = scanner.nextLine();

        System.out.print("Giá: ");
        int price = Integer.parseInt(scanner.nextLine());

        Fruit fruit = new Fruit(name, type, LocalDate.now(), LocalDate.now().plusDays(10), origin, price);
        controller.addFruit(fruit);
    }
}


