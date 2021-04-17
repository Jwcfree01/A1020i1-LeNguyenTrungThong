import java.util.Scanner;

public class OpenWT {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào bậc của ma trận: ");
        n = scanner.nextInt();

        int arr[][] = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int min = arr[n-1][n-1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && min > arr[i][j]) {
                    min = arr[i][j];
                }
                if (i+j== (n-1) && min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
