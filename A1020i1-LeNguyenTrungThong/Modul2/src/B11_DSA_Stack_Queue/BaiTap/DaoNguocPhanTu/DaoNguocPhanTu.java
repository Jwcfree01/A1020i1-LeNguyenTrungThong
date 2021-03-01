package B11_DSA_Stack_Queue.BaiTap.DaoNguocPhanTu;

import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<Integer> integerStack1 = new Stack<>();
        integerStack.push(50);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(60);
        integerStack.push(100);
        System.out.println("before: "+integerStack);
        int n =integerStack.size();
        for (int i=0; i<n; i++){
            integerStack1.push(integerStack.pop());
        }

        System.out.println("after: " + integerStack1);
    }
}
