package B2_Array_Loop.ThucHanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien cho vay");
        double a = scanner.nextInt();
        System.out.println("nhap vao lai suat");
        double b = scanner.nextInt();
        System.out.println("so thang cho vay");
        int c = scanner.nextInt();
        double tong = 0;

        for (int i=1; i<=c; i++){
            tong += a*(b/100)/12*c;
        }
        System.out.println("tong so tien la " + tong);
    }
}
