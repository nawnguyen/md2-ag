package ss14.common;

import java.util.Scanner;

public class Input {
    public static int InputInteger() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                int number = Integer.parseInt(input);
                if (number < 0) {
                    System.out.println("Vui lòng nhập số nguyên dương !");
                    continue;
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Không đúng định dạng số nguyên !");
            }
        }
    }
}
