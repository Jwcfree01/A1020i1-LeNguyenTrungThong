import java.util.Arrays;
import java.util.Scanner;

public class test_hackerrank {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 2, 1};
        int count1 = 0;
        int count2 = 0;
        for (int i=0; i<arr1.length; i++){
            if (arr1[i]>arr2[i]){
                count1++;
            }else if (arr1[i]<arr2[i]){
                count2++;
            }
        }
        int [] arr3 = {count1, count2};
        System.out.println(Arrays.toString(arr3));
    }
}
