package ss2.baiTap1;

import java.util.Scanner;

public class TinhTongCacUocSo {
    public static void main(String[] args) {
        int soCanTimUocSo;
        int TongCacUocSo = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap mot so nguyen duong: ");
            if (sc.hasNextInt()) {
                soCanTimUocSo = sc.nextInt();
                if (soCanTimUocSo > 0) break;
                else System.out.println("!So phai > 0");
            } else {
                System.out.println("!Khong phai la so nguyen");
                sc.next();
            }
        }

        System.out.print("Cac uoc so cua " + soCanTimUocSo + " la: ");
        for (int i = 1; i < soCanTimUocSo; i++) {
            if (soCanTimUocSo % i == 0) {
                System.out.print(i + " ");
                TongCacUocSo += i;
            }
        }
        System.out.println("\nTong cua cac uoc so: " + TongCacUocSo);
    }
}
