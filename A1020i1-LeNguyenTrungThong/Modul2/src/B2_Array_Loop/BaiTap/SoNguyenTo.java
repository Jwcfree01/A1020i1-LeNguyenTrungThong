package B2_Array_Loop.BaiTap;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int count =0;
        int a =2;
//        int kq = 0;
        while (count<20){
            boolean check = true;
            for (int i=2; i<a; i++){
                if (a%i==0){
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.print(a + ",");
                count++;
            }
            a++;
        }
    }
}
