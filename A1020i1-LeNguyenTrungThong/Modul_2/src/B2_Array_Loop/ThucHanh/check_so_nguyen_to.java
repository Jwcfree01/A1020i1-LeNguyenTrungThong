package B2_Array_Loop.ThucHanh;

import java.util.Scanner;

public class check_so_nguyen_to {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap num");
        int num = scanner.nextInt();
        boolean check = true;
        if (num==1){
            System.out.println(num+ " khong phai la so nguyen to");
        }
        for (int i=2; i<num; i++){
            if (num%i==0){
                System.out.println(num + "khong phai la so nguyen to");
                check = false;
                break;
            }
        }
        if (check){
            System.out.println(num + " la so nguyen to");
        }

    }
}
