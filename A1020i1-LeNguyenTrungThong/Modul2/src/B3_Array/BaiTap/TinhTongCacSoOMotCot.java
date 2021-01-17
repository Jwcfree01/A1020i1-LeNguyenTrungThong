package B3_Array.BaiTap;

import java.util.Scanner;

public class TinhTongCacSoOMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the array");
        int a = scanner.nextInt();
        System.out.println("Enter the height of the array");
        int b = scanner.nextInt();
        int arr[][] = new int[a][b];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.println("input element "+j);
                arr[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Enter the column want to sum");
        int s = scanner.nextInt();
        int sum = 0;

        for (int i=0; i<arr.length; i++){
            for (int j=s; ;){
                    sum += arr[i][j];
                    break;
            }
        }

        System.out.println(sum);

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
