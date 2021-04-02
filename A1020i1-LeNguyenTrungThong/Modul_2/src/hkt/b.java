package hkt;

import java.util.Scanner;

class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String[] words = s1.split(" ");
        int a = Integer.parseInt(words[0]);
        int b = Integer.parseInt(words[1]);
        int num = Integer.parseInt(words[2]);

        int[][] arr = new int[a][b];

        int [][] arr1 = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if (arr[i][j]>num){
                    arr1[i][j] = 1;
                }else {
                    arr1[i][j] = 0;
                }
            }
        }

        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j] + "");
            }
            System.out.println();
        }
    }
}