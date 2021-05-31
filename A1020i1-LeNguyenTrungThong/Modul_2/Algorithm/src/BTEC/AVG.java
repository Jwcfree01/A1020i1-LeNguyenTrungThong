package BTEC;

import java.util.Scanner;

public class AVG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Diem: ");
        double score;
        score = sc.nextDouble();
        if (score >= 9 && score <= 10) {
            System.out.println("Xuat sac");
        } else if (score >= 8) {
            System.out.println("Gioi");
        } else if (score >= 7) {
            System.out.println("Kha");
        } else if (score >= 6) {
            System.out.println("TBKha");
        } else if (score >= 5) {
            System.out.println("TB");
        } else if (score >= 0) {
            System.out.println("Yeu");
        } else {
            System.out.println("Nhap Khong Hop Le");
        }
    }
    }
}
