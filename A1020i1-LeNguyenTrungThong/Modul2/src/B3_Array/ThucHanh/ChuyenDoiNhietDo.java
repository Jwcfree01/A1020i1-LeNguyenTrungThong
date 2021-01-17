package B3_Array.ThucHanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("1: chuyen tu do F sang do C");
            System.out.println("2: chuyen tu do C sang do F");
            System.out.println("3: exit");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("nhap do F");
                    double doF = scanner.nextInt();
                    System.out.println((doF - 32) / 1.8);
                    break;
                case 2:
                    System.out.println("nhap do C");
                    double doC = scanner.nextInt();
                    System.out.println(1.8 * doC + 32);
                    break;
                case 3:
                    check=false;
                    break;
                default:
                    System.out.println("vui long chon dung dinh dang");
            }
        }while (check);
    }
}
