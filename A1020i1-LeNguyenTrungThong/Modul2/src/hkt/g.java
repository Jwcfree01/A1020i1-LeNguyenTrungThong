package hkt;

import java.util.Scanner;

public class g {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--");
        String s1 = scanner.nextLine();
        String[] words = s1.split(" ");
        int a = Integer.parseInt(words[0]);
        int b = Integer.parseInt(words[1]);
        int c = Integer.parseInt(words[2]);
        int d = Integer.parseInt(words[3]);

        int arr[][] = new int[a][b];
        int arr1[][] = new int [c][d];
        int arr2[][] = new int [a-c+1][b-d+1];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.println("nhap phan tu img "+i +j);
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++){
                System.out.println("nhap phan tu con "+i +j);
                arr1[i][j] = scanner.nextInt();
            }
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
                System.out.println(arr1[i][j]);
                arr2[i][j] = (arr[i][j]) * (arr1[i][j]);
            }
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){

                System.out.println(arr[i][j]);
            }
        }

//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                System.out.print("abc "+ arr[i][j]);
//            }
//        }
//
//        for (int i=0; i<arr1.length; i++){
//            for (int j=0; j<arr1[i].length; j++){
//                System.out.print("bcd "+ arr[i][j]);
//            }
//        }
    }
}
