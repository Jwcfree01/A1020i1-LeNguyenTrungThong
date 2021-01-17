package B3_Array.ThucHanh;

import java.util.Scanner;

public class DemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stu;
        do {
            System.out.println("Enter the number of student");
            stu = scanner.nextInt();
        }while (stu>30);

        int [] arr = new int[stu];

        int pass = 0;
        for (int i=0; i<arr.length; i++){
            System.out.println("Enter the grade of student "+i);
            arr[i] = scanner.nextInt();
            if (arr[i]>=5){
                pass++;
            }
        }
        System.out.println("Total students with scores greater than 5: "+pass);
    }
}
