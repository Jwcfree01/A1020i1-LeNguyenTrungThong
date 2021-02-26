package B3_Array.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("so phan tu cua mang 1");
        int a = scanner.nextInt();
        int [] arr1 = new int[a];
        for (int i=0; i<a; i++){
            System.out.println("nhap phan tu thu: "+i);
            arr1[i]= scanner.nextInt();
        }
        System.out.println("so phan tu cua mang 2");
        int b = scanner.nextInt();
        int [] arr2 = new int[b];
        for (int i=0; i<b; i++){
            System.out.println("nhap phan tu thu: "+i);
            arr2[i]= scanner.nextInt();
        }

        int [] arr3 = new int [arr1.length+arr2.length];

        for (int i=0; i<arr1.length; i++){
                arr3[i] = arr1[i];
        }

        for (int i=arr1.length; i<arr3.length; i++){
                arr3[i] = arr2[i-arr1.length];
        }

        System.out.println(Arrays.toString(arr3));
    }
}
