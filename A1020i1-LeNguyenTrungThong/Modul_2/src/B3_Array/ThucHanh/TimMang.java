package B3_Array.ThucHanh;

import java.util.Arrays;
import java.util.Scanner;

public class TimMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("mang co bn hoc sinh");
        int a = scanner.nextInt();
        scanner.nextLine();
        String [] arr = new String[a];

        for (int i=0; i<a; i++){
            arr[i] = scanner.nextLine();
        }

        char n = (char) scanner.nextLine().charAt(0);
        System.out.println("nhap ten ban muon tim");
        String name = scanner.nextLine();
        int viTri=0;

        for (int i=0; i<arr.length; i++){
            if (arr[i].equals(name)){
                viTri = i;
                break;
            }
        }
        System.out.println("vi tri ten ban can tim la: " +viTri);
    }
}
