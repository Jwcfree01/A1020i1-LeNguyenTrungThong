package SoNguyenTo;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean check = true;

        for (int i=2; i<a; i++){
            if (a%i==0){
                check=false;
                break;
            }
        }

        if(check){
            check=true;
        }
        System.out.println(check);
    }
}
