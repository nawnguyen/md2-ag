package ss9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {

            System.out.println("==========MENU==========\n" +
                    "1. Hiển thị danh sách\n" +
                    "2. Thêm trái cây\n" +
                    "0. Thoát\n" +
                    "========================\n" +
                    "Nhập lựa chọn: \n"
            );
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    FruitManagement.showFruit();
                    break;
                case 2:
                    FruitManagement.addFruit();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình !");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !");

            }
        } while (choice != 0);
    }
}
