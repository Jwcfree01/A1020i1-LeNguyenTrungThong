package hkt;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n va m");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("nhap ma tran");
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // System.out.println(" the hien ma tran ");
        //             for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
//			}
//		}
        // lam o day
        int[] a = new int[256];
        for(int i = 0 ; i< 256 ; i++)
        {
            a[i] = 0;
        }

        //lamf
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[arr[i][j]] += 1;
            }
        }


        for (int i = 0; i < 256; i++) {

            System.out.print(a[i]);

        }
    }
}
