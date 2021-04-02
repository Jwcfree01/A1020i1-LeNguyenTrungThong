package B3_Array.BaiTap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many element in array arr");
        int a = scanner.nextInt();
        int [] arr = new int[a];
        for (int i=0; i<arr.length; i++){
            System.out.println("input element "+i);
            arr[i]= scanner.nextInt();
        }
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("number "+ min+ " is element min");
    }
}
