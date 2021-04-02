package B3_Array.ThucHanh;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mang co bao nhieu phan tu");
        int a = scanner.nextInt();
        int [] arr = new int[a];


        for (int i=0; i<a; i++){
            System.out.println("nhap phan tu thu " +i);
            arr[i]=scanner.nextInt();
        }

        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("so nho nhat: "+min);
    }
}
