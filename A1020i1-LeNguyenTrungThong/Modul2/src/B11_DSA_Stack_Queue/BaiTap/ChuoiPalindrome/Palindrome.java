package B11_DSA_Stack_Queue.BaiTap.ChuoiPalindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Character> stringQueue = new LinkedList<>();
        Stack<String> stringStack = new Stack<>();
        System.out.println("nhap vao chuoi can kiem tra");
        String n = scan.nextLine();

        for (int i = n.length()-1; i >=0; i--) {
            stringQueue.add(n.charAt(i));
        }
        int a = stringQueue.size();
        String reverseString = "";
        for (int i=0; i<a; i++){
            reverseString = reverseString+stringQueue.remove();
        }
        if (n.equals(reverseString)){
            System.out.println(n + " la chuoi Palindrome");
        }else {
            System.out.println(n + " khong phai la chuoi Palindrome");
        }
    }


//        stringQueue.add(n);
//        stringStack.push(n);
//
//        String a = stringQueue.poll();
//        String b = stringStack.pop();
//
//        if (a.equals(b)){
//            System.out.println("ok");
//        }else {
//            System.out.println("not ok");
//        }
//
//
}
