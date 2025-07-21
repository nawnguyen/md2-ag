package ss10;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = sc.nextInt();

        Stack<Integer> stack = PrimeWithStackQueue.getPrimeStack(n);
        Queue<Integer> queue = PrimeWithStackQueue.getPrimeQueue(n);

        System.out.println("Dùng Stack:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\nDùng Queue:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
