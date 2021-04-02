package B11_DSA_Stack_Queue.BaiTap.KiemTraDauNgoac;

import java.util.Scanner;
import java.util.Stack;

public class KiemTra {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack<String> stringStack = new Stack<>();
        Stack<String> left = new Stack<>();
        System.out.println("nhap bieu thuc");
        String bieuThuc = scan.nextLine();

        String br = "";
        boolean check = true;
        for (int i = 0; i < bieuThuc.length(); i++) {
            String a = bieuThuc.substring(i, (i+1));
            if (a.equals("(")) {
                stringStack.push(a);
            }

            if (a.equals(")")) {
                if (stringStack.isEmpty()|| br.equals(")")) {
                    System.out.println("bieu thuc sai");
                    check = false;
                    break;
                } else {
                    left.push(a);
                }
            }
            br = a;
        }

        if (check){
            if (stringStack.size()== left.size()){
                System.out.println("bieu thuc dung");
            }else {
                System.out.println("bieu thuc sai");
            }
        }



//        Stack<String> stringStack = new Stack<>();
//        System.out.println("nhap bieu thuc");
//        String bieuThuc = scan.nextLine();
//
//        boolean check = true;
//        for (int i=0; i<bieuThuc.length(); i++){
//            String sym = "";
//            String left = "";
//            String a = bieuThuc.substring(i, (i+1));
//            if (a.equals("(")){
//                stringStack.push(a);
//            }
//            if (a.equals(")")) {
//                sym = a;
//                left = stringStack.pop();
//                if (sym!=left) {
//                    System.out.println("dung");
//                }else {
//                    check=false;
//                    System.out.println("sai");
//                    break;
//                }
//            }
//        }
//        if (check){
//            System.out.println("dung");
//        }


    }
}
