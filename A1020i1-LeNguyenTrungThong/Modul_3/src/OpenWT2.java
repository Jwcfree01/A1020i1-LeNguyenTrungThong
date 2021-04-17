import java.util.Scanner;

public class OpenWT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        if (n < 2) {
            return;
        }

        int i = n;
        while (true) {
            if (isPrimeNumber(i)) {
                int reversed = 0;
                int ab;
                ab = i;
                while(i != 0) {
                    int digit = i % 10;
                    reversed = reversed * 10 + digit;
                    i /= 10;
                }
                if(reversed == ab){
                    System.out.println(ab);
                    return;
                }
            }
            i++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

