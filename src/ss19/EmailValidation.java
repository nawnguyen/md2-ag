package ss19;

import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập danh sách email, ngăn cách nhau bởi dấu chấm phẩy (;):");
        String input = scanner.nextLine();

        String[] emails = input.split(";");

        System.out.println("\nKết quả kiểm tra:");
        for (int i = 0; i < emails.length; i++) {
            String email = emails[i].trim();
            if (isValidEmail(email)) {
                System.out.println((i + 1) + ". " + email + " -> Hợp lệ");
            } else {
                System.out.println((i + 1) + ". " + email + " -> Không hợp lệ");
            }
        }
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_]{6,32}@[a-zA-Z0-9]{2,12}\\.[a-zA-Z0-9]{2,12}$";

        return email.matches(regex);
    }
}
