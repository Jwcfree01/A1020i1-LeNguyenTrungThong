package hkt;

import java.util.Scanner;

public class J {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input k");
        int k = scanner.nextInt();
        int num = 0;

        int[] arr1 = new int[k];
        for (int i = 0; i < k; i++) {
            System.out.println("nhap phan tu thu: " + i);
            arr1[i] = scanner.nextInt();
            for (int j = i; j < k - 1; j++) {
                int a = arr1[j] % 4;
                if (a % 2 != 0) {
                    num += a;
                }
            }
        }
        System.out.println("sum = " + num);
    }
}
