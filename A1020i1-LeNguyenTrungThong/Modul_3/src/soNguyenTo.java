import java.util.Scanner;

public class soNguyenTo {
    public static boolean isPrimeNumber(int n) {
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int n = scanner.nextInt();
        while (a>1){
            boolean check = true;
            for (int i=n; i>=n; n++){
                if (n%i==0){
                    check=false;
                    break;
                }
                if (check){
                    int reversed = 0;
                    int ab = n;
                    while(n != 0) {
                        int digit = n % 10;
                        reversed = reversed * 10 + digit;
                        n /= 10;
                    }
                    if(reversed == ab){
                        System.out.println(n);
                        a++;
                    }
                }
            }

        }
    }
}
