package B3_Array.BaiTap;

import java.util.Scanner;

public class TinhTongCacSoODuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int sum = 0;

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if (i==j){
                    sum+=arr[i][j];
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
