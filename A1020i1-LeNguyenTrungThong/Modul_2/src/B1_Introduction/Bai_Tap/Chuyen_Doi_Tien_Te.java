package B1_Introduction.Bai_Tap;

import java.util.Scanner;

public class Chuyen_Doi_Tien_Te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien can chuyen sang VND");
        int usd =scanner.nextInt();
        System.out.println(usd*23000);
    }
}
