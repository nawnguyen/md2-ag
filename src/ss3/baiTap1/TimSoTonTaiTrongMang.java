package ss3.baiTap1;

import java.util.Scanner;

public class TimSoTonTaiTrongMang {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 5, 6, 7, 1, 8, 9, 3};
        int soCanTim;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap mot so nguyen duong: ");
            if (sc.hasNextInt()) {
                soCanTim = sc.nextInt();
                break;
            }else  {
                System.out.println("Khong phai so nguyen !");
                sc.next();
            }
        }
        boolean tonTai = false;
        for (int x : arr) {
            if (x== soCanTim) {
                tonTai = true;
                break;
            }
        }
        if (tonTai) {
            System.out.println("So nhap vao co trong mang !");
        }else  {
            System.out.println("So nhap vao khong ton tai trong mang !");
        }
    }
}
