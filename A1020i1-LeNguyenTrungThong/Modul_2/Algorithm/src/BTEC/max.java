package BTEC;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        int a, b, c;
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap a: ");
        b = sc.nextInt();
        System.out.println("Nhap a: ");
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " la so lon nhat");
        } else if (b > a && b > c) {
            System.out.println(b + " la so lon nhat");
        } else if (c > a && c > b) {
            System.out.println(c + " la so lon nhat");
        }
    }
}
