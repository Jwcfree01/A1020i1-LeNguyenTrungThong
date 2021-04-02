package hkt;

import java.util.Scanner;

public class bai2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao khoang gia tri");

        boolean flag = true;
        int a = 0;
        int b = 0;
        while (flag) {
            String s1 = scanner.nextLine();
            String[] words = s1.split(" ");
            a = Integer.parseInt(words[0]);
            b = Integer.parseInt(words[1]);
            if (Math.pow(-10,9)>a && a>Math.pow(10,9) || Math.pow(-10,9)>b && b>Math.pow(10,9)) {
                System.out.println("vui long nhap lai");
                break;
            } else {
                System.out.println("ok");
                flag = false;
            }
        }

        int num = 0;

        if (a<b){
            for (int i = a; i<=b; i++){
                if (i%2==0){
                    num+=i;
                }
            }
        }else {
            for (int i = b; i<=a; i++){
                if (i%2==0){
                    num+=i;
                }
            }
        }
        System.out.println(num);
    }
}

