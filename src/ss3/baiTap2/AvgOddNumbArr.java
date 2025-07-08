package ss3.baiTap2;

import java.util.Scanner;

public class AvgOddNumbArr {
    public static void main(String[] args) {
        int size;
        int[] array;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter the size of the array:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter the value " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Elements in array: ");
        for (int e : array) {
            System.out.print(e + " ");
        }

        int sum = 0;
        int count = 0;
        for (i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum += array[i];
                count++;
            }
        }
        if (count > 0) {
            System.out.println("\nAvg at odd location: " + (double) sum / count);
        }else {
            System.out.println("There is no number at odd location");
        }
    }
}
