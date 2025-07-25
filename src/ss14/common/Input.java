package ss14.common;

import java.util.Scanner;

public class Input extends Exception {
    public static int InputInteger() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());

            }catch (NumberFormatException e){
                System.out.println("Nhập vào số nguyên dương !");
                continue;
            }catch (Exception e){
                System.out.println("Lỗi không xác định !");
                continue;
            }
            return choice;
        }
    }
}
