package B3_Array.BaiTap;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("mang co bao nhieu phan tu");
        int a = scanner.nextInt();
        int [] arr = new int[a+1];

        for (int i=0; i<a; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("nhap vao phan tu can chen");
        int num = scanner.nextInt();
        System.out.println("nhap vaovi tri can chen");
        int viTri = scanner.nextInt();

        for (int i=a; i>viTri; i--){
            arr[i] = arr[i-1];
        }
        arr[viTri]=num;
        System.out.println(Arrays.toString(arr));
    }
}
