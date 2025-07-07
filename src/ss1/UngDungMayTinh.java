package ss1;

import java.util.Scanner;

public class UngDungMayTinh {
    public static void main(String[] args) {
        int a, b;
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap so nguyen thu nhat:");
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                break;
            } else {
                System.out.println("Khong phai so nguyen!");
                sc.next();
            }
        }
        while (true) {
            System.out.println("Nhap so nguyen thu hai:");
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                break;
            } else {
                System.out.println("Khong phai so nguyen!");
                sc.next();
            }
        }
        System.out.println("----CHON PHEP TINH----");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");
        System.out.println("5. Thoat");

        while (true) {
            System.out.println("Nhap lua chon tu (1-5):");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice >= 1 && choice <= 5) {
                    break;
                } else {
                    System.out.println("Lua chon khong hop le!");
                }
            }else{
                System.out.println("Khong phai so nguyen!");
                sc.next();
            }
        }

        switch (choice) {
            case 1:
                System.out.println("Ket qua:" + (a + b));
                break;
            case 2:
                System.out.println("Ket qua:" + (a - b));
                break;
            case 3:
                System.out.println("Ket qua:" + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Ket qua:" + ((double)a / b));
                } else {
                    System.out.println("Khong the chia cho 0!");
                }
                break;
            case 5:
                System.out.println("Da thoat!");
                break;
        }
    }
}
