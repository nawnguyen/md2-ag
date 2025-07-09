package ss3.baiTap1;

import java.util.Scanner;

public class TimSoTonTaiTrongMang {
    public static int NhapSoNguyenDuong(Scanner sc) {
        int so;
        while (true) {
            System.out.println("Nhap so nguyen duong: ");
            if (sc.hasNextInt()) {
                so = sc.nextInt();
                if (so > 0) {
                    return so;
                } else {
                    System.out.println("So nguyen duong phai lon hon 0 !");
                }
            }else {
                System.out.println("Khong phai la so nguyen !");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 5, 6, 7, 1, 8, 9, 3};

        Scanner sc = new Scanner(System.in);
        int soCanTim= NhapSoNguyenDuong(sc);
        boolean tonTai = false;
        for (int x : arr) {
            if (x == soCanTim) {
                tonTai = true;
                break;
            }
        }
        if (tonTai) {
            System.out.println("So nhap vao co trong mang !");
        } else {
            System.out.println("So nhap vao khong ton tai trong mang !");
        }
    }
}
