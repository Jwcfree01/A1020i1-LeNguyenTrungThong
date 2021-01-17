package B3_Array.BaiTap;

import java.util.Scanner;

public class DemKiTuChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String a = scanner.nextLine();

        System.out.println("Enter the characters want to search");
        char b = 'e';
        int count=0;
        for (int i=0; i<a.length(); i++){
            if (a.charAt(i)==b){
                count++;
            }
        }
        System.out.println(count);
    }
}
