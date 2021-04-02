package B2_Array_Loop.ThucHanh;

import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Tam Giac");
        System.out.println("2: Hinh Vuong");
        System.out.println("3: Hinh Chu Nhat");
        System.out.println("4: Exit");
        System.out.println("Enter choice");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("No choice!");
                while(choice!= 0) {
                }
        }
    }
}
