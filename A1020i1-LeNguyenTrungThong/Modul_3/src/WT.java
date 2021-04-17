import java.util.Scanner;

public class WT {
//
//    static Scanner input = new Scanner(System.in);
//    static boolean flag = true;
//    static int B = input.nextInt();
//    static int H = input.nextInt();
//
//    static{
//        try{
//            if(B <= 0 || H <= 0){
//                flag = false;
//                throw new Exception("Breadth and height must be positive");
//            }
//        }catch(Exception e){
//            System.out.println(e);
//        }
//
//    }

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();

            String s = ""+n;

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

//        if(flag){
//            int area=B*H;
//            System.out.print(area);
//        }
    }



//        int t = scan.nextInt();
//        int sum =0;
//        for (int i=0; i<t; i++){
//            int a = scan.nextInt();
//            int b = scan.nextInt();
//            int n = scan.nextInt();
//            for (int j=0; j<n; j++) {
//                if (j==0) {
//                    sum = (int) (a + Math.pow(2, j) * b);
//                }
//                if (j>0){
//                    sum+=Math.pow(2,j)*b;
//                }
//                System.out.print(sum + " ");
//            }
//        }


//        int t = scan.nextInt();
//        for (int i = 0; i < t; i++) {
//            try {
//                long a = scan.nextLong();
//                if (a >= Byte.MIN_VALUE && a <= Byte.MAX_VALUE) {
//                    System.out.println(a+ " can be fitted in: \n* byte \n* short \n* int \n* long");
//                } else
//                if (a >= Short.MIN_VALUE && a <= Short.MAX_VALUE) {
//                    System.out.println(a+ " can be fitted in: \n* short \n* int \n* long");
//                } else
//                if (a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE) {
//                    System.out.println(a+ " can be fitted in: \n* int \n* long");
//                }else
//                if (a >= Long.MIN_VALUE && a <= Long.MAX_VALUE) {
//                    System.out.println(a+ " can be fitted in: \n* long");
//                }
//            } catch (Exception e) {
//                System.out.println(scan.next() +" can't be fitted anywhere.");
//            }
//
//        }

//        int count =1;
//
//        while (scan.hasNext()){
//            String n = scan.nextLine();
//            System.out.println(count + " "+ n);
//            count++;
//        }

