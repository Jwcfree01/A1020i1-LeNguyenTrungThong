package B3_Array.ThucHanh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai cua mang");
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for (int i=0; i<a; i++){
            System.out.println("nhap phan tu thu "+i+" cua mang");
            arr[i]=scanner.nextInt();
        }
        String num = "";
        for (int i=arr.length-1; i>=0; i--){
            num += arr[i]+",";
        }
        System.out.println(num);
        System.out.println(Arrays.toString(arr));
    }
}
