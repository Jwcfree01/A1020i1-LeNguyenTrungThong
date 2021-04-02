package B3_Array.ThucHanh;

import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mang co bao nhieu phan tu");
        int a = scanner.nextInt();
        int [] arr = new int [a];
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            System.out.println("nhap phan tu thu " +i);
            arr[i] = scanner.nextInt();
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max =arr[i];
            }
        }
        System.out.println("gia tri lon nhat trong mang la: " + max);
    }
}
