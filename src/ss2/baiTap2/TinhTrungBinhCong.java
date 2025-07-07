package ss2.baiTap2;

import java.util.Scanner;

public class TinhTrungBinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        while (true){
            System.out.println("Nhap so nguyen duong thu nhat:");
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                if (a > 0) break;
                else System.out.println("Phai > 0 !");
            } else {
                System.out.println("Khong phai so nguyen !");
                sc.next();
            }
        }
        while (true){
            System.out.println("Nhap so nguyen thu hai:");
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                if(b>0) break;
                else System.out.println("Phai > 0 !");
            }else {
                System.out.println("Khong phai so nguyen 1");
                sc.next();
            }
        }

        int ucln = tinhUCLN(a, b);
        int bcnn = tinhBCNN(a, b);
        double trungBinh = (ucln + bcnn) / 2.0;
        System.out.println("UCLN cua " + a + " va " + b + " la: " + ucln);
        System.out.println("BCNN cua " + a + " va " + b + " la: "+ bcnn);
        System.out.println("Trung binh cua UCLN va BCNN la: " + trungBinh);
    }
    public static int tinhUCLN(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int tinhBCNN(int a, int b){
        return (a * b)/ tinhUCLN(a, b);
    }
}
