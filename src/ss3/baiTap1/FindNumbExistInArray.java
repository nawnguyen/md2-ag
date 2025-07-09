package ss3.baiTap1;

import java.util.Scanner;

public class FindNumbExistInArray {
    public static int EnterPositiveInteger(Scanner sc) {
        int integer;
        while (true) {
            System.out.println("Nhap so nguyen duong: ");
            if (sc.hasNextInt()) {
                integer = sc.nextInt();
                if (integer > 0) {
                    return integer;
                } else {
                    System.out.println("So nguyen duong phai lon hon 0 !");
                }
            }else {
                System.out.println("Khong phai la so nguyen duong !");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 5, 6, 7, 1, 8, 9, 3};

        Scanner sc = new Scanner(System.in);
        int numberToFind= EnterPositiveInteger(sc);
        boolean exist = false;
        for (int x : arr) {
            if (x == numberToFind) {
                exist = true;
                break;
            }
        }
        if (exist) {
            System.out.println("So nhap vao co trong mang !");
        } else {
            System.out.println("So nhap vao khong ton tai trong mang !");
        }
    }
}
