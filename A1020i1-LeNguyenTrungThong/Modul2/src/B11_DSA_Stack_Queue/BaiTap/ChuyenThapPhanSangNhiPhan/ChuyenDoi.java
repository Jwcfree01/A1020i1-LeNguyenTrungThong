package B11_DSA_Stack_Queue.BaiTap.ChuyenThapPhanSangNhiPhan;
import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so thap phan can chuyen doi");
        int num = scanner.nextInt();
        Stack<Integer> integerStack = new Stack<>();

        while (num !=0){
            int d = num%2;
            integerStack.push(d);
            num /=2;
        }

        while (!integerStack.isEmpty()){
            System.out.print(integerStack.pop());
        }
    }
}
