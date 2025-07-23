package ss13.view;
import ss13.controller.ExpenseController;
import ss13.model.Expense;

import java.util.List;
import java.util.Scanner;

public class ExpenseView {
    private ExpenseController controller = new ExpenseController();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n------ QUẢN LÝ CHI TIÊU ------");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm chi tiêu");
            System.out.println("3. Xóa chi tiêu");
            System.out.println("4. Sửa chi tiêu");
            System.out.println("5. Tìm theo mã");
            System.out.println("6. Tìm gần đúng theo tên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    displayList();
                    break;
                case "2":
                    add();
                    break;
                case "3":
                    delete();
                    break;
                case "4":
                    update();
                    break;
                case "5":
                    findById();
                    break;
                case "6":
                    searchByName();
                    break;
                case "0":
                    System.out.println("Đã thoát !");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ !");
            }
        }
    }

    private void displayList() {
        List<Expense> list = controller.getAll();
        list.forEach(System.out::println);
    }

    private void add() {
        System.out.print("Nhập mã: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày: ");
        String date = scanner.nextLine();
        System.out.print("Nhập số tiền: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập mô tả: ");
        String note = scanner.nextLine();

        Expense e = new Expense(id, name, date, amount, note);
        controller.addExpense(e);
        System.out.println("Đã thêm !");
    }

    private void delete() {
        System.out.print("Nhập mã cần xóa: ");
        String id = scanner.nextLine();
        controller.deleteExpense(id);
        System.out.println("Đã xóa !");
    }

    private void update() {
        System.out.print("Nhập mã cần sửa: ");
        String id = scanner.nextLine();

        System.out.print("Tên mới: ");
        String name = scanner.nextLine();
        System.out.print("Ngày mới: ");
        String date = scanner.nextLine();
        System.out.print("Số tiền mới: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("Mô tả mới: ");
        String note = scanner.nextLine();

        Expense e = new Expense(id, name, date, amount, note);
        controller.updateExpense(id, e);
        System.out.println("Đã cập nhật !");
    }

    private void findById() {
        System.out.print("Nhập mã cần tìm: ");
        String id = scanner.nextLine();
        Expense e = controller.findById(id);
        if (e != null) System.out.println(e);
        else System.out.println("Không tìm thấy !");
    }

    private void searchByName() {
        System.out.print("Nhập tên gần đúng: ");
        String name = scanner.nextLine();
        List<Expense> list = controller.searchByName(name);
        for (Expense e : list) {
            System.out.println(e);
        }
    }
}
