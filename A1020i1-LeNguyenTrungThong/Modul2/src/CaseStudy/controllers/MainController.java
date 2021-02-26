package CaseStudy.controllers;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class MainController {
    Scanner scan = new Scanner(System.in);

//    public void addService(){
//        System.out.println("full name");
//        String name = scan.nextLine();
//        System.out.println("dOB");
//        int dOB = scan.nextInt();
//        System.out.println("cmnd");
//        int cmnd = scan.nextInt();
//        System.out.println("sdt");
//        int sdt = scan.nextInt();
//        scan.nextLine();
//        System.out.println("email");
//        String email = scan.nextLine();
//        System.out.println("Trinh do");
//        String trinhDo = scan.nextLine();
//        System.out.println("vi tri");
//        String viTri = scan.nextLine();
//        System.out.println("luong");
//        double luong = scan.nextInt();
//    }

    public void addService(){
        System.out.println("1. massage" + "\n" +
                "2. karaoke" + "\n" +
                "3. thuc an" + "\n" +
                "4. nuoc un" + "\n" +
                "5. thue xe" + "\n" );
    }

    public void displayMainMenu(){
        int num;
        do {
            System.out.println("1. Add New Services" + "\n" +
                    "2. Show Services" + "\n" +
                    "3. Add New Customer" + "\n" +
                    "4. Show Information of Customer" + "\n" +
                    "5. Add New Booking" + "\n" +
                    "6. Show Information of Employee" + "\n" +
                    "7. Exit" + "\n"
            );
            System.out.println("Input Number");
            num = scan.nextInt();
            switch (num) {
                case 1:
                    System.out.println("1. Add New Villa" + "\n" +
                            "2. Add New House" + "\n" +
                            "3. Add New Room" + "\n" +
                            "4. Back to menu" + "\n" +
                            "5. Exit" + "\n");
                    int num1 = scan.nextInt();
                    switch (num1){
                        case 1:
                            System.out.println("Add new service of Villa");
                            break;
                        case 2:
                            
                    }
                    break;
                case 2:
                    System.out.println("hien thi");
                    break;
                case 3:
                    return;
            }
        }while (num<7);
    }

}
